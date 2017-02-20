package nl.rubensten.texifyidea.templates;

import com.intellij.ide.fileTemplates.*;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import nl.rubensten.texifyidea.TexifyIcons;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Ruben Schellekens
 */
public class LatexTemplatesFactory implements FileTemplateGroupDescriptorFactory {

    public static final String DESCRIPTOR = "LaTeX";

    public static final String FILE_TEMPLATE_TEX = "LaTeX Source.tex";
    public static final String FILE_TEMPLATE_STY = "LaTeX Package.sty";
    public static final String FILE_TEMPLATE_CLS = "LaTeX Document class.cls";
    public static final String FILE_TEMPLATE_BIB = "BibTeX Bibliography.bib";

    public static PsiFile createFromTemplate(PsiDirectory directory, String fileName,
                                             String templateName, FileType fileType) {
        Project project = directory.getProject();
        FileTemplateManager templateManager = FileTemplateManager.getInstance(project);
        FileTemplate template = templateManager.getInternalTemplate(templateName);
        Properties properties = new Properties(templateManager.getDefaultProperties());

        String templateText;
        try {
            templateText = template.getText(properties);
        }
        catch (IOException e) {
            throw new RuntimeException("Could not load tempalte " +
                    templateManager.internalTemplateToSubject(templateName), e);
        }

        PsiFileFactory fileFactory = PsiFileFactory.getInstance(project);
        PsiFile file = fileFactory.createFileFromText(fileName, fileType, templateText);
        return (PsiFile)directory.add(file);
    }

    @Override
    public FileTemplateGroupDescriptor getFileTemplatesDescriptor() {
        FileTemplateGroupDescriptor descriptor = new FileTemplateGroupDescriptor(
                DESCRIPTOR,
                TexifyIcons.LATEX_FILE
        );

        descriptor.addTemplate(new FileTemplateDescriptor(FILE_TEMPLATE_TEX, TexifyIcons.LATEX_FILE));
        descriptor.addTemplate(new FileTemplateDescriptor(FILE_TEMPLATE_STY, TexifyIcons.STYLE_FILE));
        descriptor.addTemplate(new FileTemplateDescriptor(FILE_TEMPLATE_CLS, TexifyIcons.CLASS_FILE));
        descriptor.addTemplate(new FileTemplateDescriptor(FILE_TEMPLATE_BIB, TexifyIcons.BIBLIOGRAPHY_FILE));

        return descriptor;
    }
}
