package nl.rubensten.texifyidea.lang;

import java.util.*;

/**
 * @author Sten Wessel
 */
public enum LatexNoMathCommand {

    A_RING("aa", "å"),
    CAPITAL_A_RING("AA", "Å"),
    AE("ae", "æ"),
    CAPITAL_AE("AE", "Æ"),
    APPENDIX("appendix"),
    AUTHOR("author", new RequiredArgument("names")),
    BEGIN("begin", new RequiredArgument("environment")),
    END("end", new RequiredArgument("environment")),
    ENSUREMATH("ensuremath", new RequiredArgument("text")),
    BFSERIES("bfseries"),
    BIBITEM("bibitem", new OptionalArgument("label"), new RequiredArgument("citekey")),
    BIBLIOGRAPHYSTYLE("bibliographystyle", new RequiredArgument("style")),
    BIBLIOGRAPHY("bibliography", new RequiredFileArgument("bibliography file", "bib")),
    BIGSKIP("bigskip"),
    BOLDMATH("boldmath"),
    CAPTION("caption", new OptionalArgument("shorttext"),
            new RequiredArgument("text")),
    CHAPTER("chapter", new OptionalArgument("shorttitle"),
            new RequiredArgument("title")),
    CHAPTER_STAR("chapter*", new RequiredArgument("title")),
    CITE("cite", new OptionalArgument("extratext"), new RequiredArgument("keys")),
    CLEARDOUBLEPAGE("cleardoublepage"),
    CLEARPAGE("clearpage"),
    COLUMNWIDTH("columnwidth"),
    CONTENTSLINE("contentsline", new RequiredArgument("type"),
            new RequiredArgument("text"), new RequiredArgument("page")),
    CONTENTSNAME("contentsname", new RequiredArgument("name")),
    DATE("date", new RequiredArgument("text")),
    DOCUMENTCLASS("documentclass", new OptionalArgument("options"),
            new RequiredArgument("class")),
    EM("em"),
    EMPH("emph", new RequiredArgument("text")),
    ENLARGETHISPAGE("enlargethispage", new RequiredArgument("size")),
    ENLARGETHISPAGE_STAR("enlargethispage*", new RequiredArgument("size")),
    FAMILY("family"),
    FBOX("fbox", new RequiredArgument("text")),
    FIGURENAME("figurename", new RequiredArgument("name")),
    FLQ("flq", "‹"),
    FLQQ("flqq", "«"),
    FLUSHBOTTOM("flushbottom"),
    FLUSHLEFT("flushleft"),
    FLUSHRIGHT("flushright"),
    FONTENCODING("fontencoding", new RequiredArgument("enc")),
    FONTFAMILY("fontfamily", new RequiredArgument("family")),
    FONTSERIES("fontseries", new RequiredArgument("series")),
    FONTSHAPE("fontshape", new RequiredArgument("shape")),
    FONTSIZE("fontsize", new RequiredArgument("size"), new RequiredArgument("skip")),
    FOOTNOTESIZE("footnotesize"),
    FOOTNOTETEXT("footnotetext", new OptionalArgument("number"),
            new RequiredArgument("text")),
    FOOTNOTE("footnote", new OptionalArgument("number"), new RequiredArgument("text")),
    FRAMEBOX("framebox", new OptionalArgument("width"),
            new OptionalArgument("pos"), new OptionalArgument("text")),
    FRAME("frame", new RequiredArgument("text")),
    FRQ("frq", "›"),
    FRQQ("frqq", "»"),
    GLOSSARYENTRY("glossaryentry", new RequiredArgument("text"),
            new RequiredArgument("pagenum")),
    GLOSSARY("glossary", new RequiredArgument("text")),
    GLQ("glq", ","),
    GLQQ("glqq", "„"),
    GRQ("grq", "‘"),
    GRQQ("grqq", "“"),
    HFILL("hfill"),
    HRULE("hrule"),
    HRULEFILL("hrulefill"),
    HSPACE("hspace", new RequiredArgument("length")),
    HSPACE_STAR("hspace*", new RequiredArgument("length")),
    HSS("hss"),
    HUGE("huge"),
    CAPITAL_HUGE("Huge"),
    HYPHENATION("hyphenation", new RequiredArgument("words")),
    I("i", "i (dotless)"),
    INCLUDE("include", new RequiredFileArgument("source file", "tex")),
    INPUT("input", new RequiredFileArgument("source file", "tex")),
    INCLUDEONLY("includeonly", new RequiredFileArgument("source file", "tex")),
    INDEXNAME("indexname", new RequiredArgument("name")),
    INDEXSPACE("indexspace"),
    INDEX("intex", new RequiredArgument("entry")),
    ITEM("item", new OptionalArgument("label")),
    ITSHAPE("itshape"),
    LABEL("label", new RequiredArgument("key")),
    LARGE("large"),
    CAPITAL_LARGE("Large"),
    SCREAMING_LARGE("LARGE"),
    LATEX("LaTeX", "LaTeX"),
    LATEXE("LaTeXe", "LaTeX2ε"),
    LDOTS("ldots", "…"),
    LEFTEQN("lefteqn"),
    LINEBREAK("linebreak", new OptionalArgument("number")),
    LINETHICKNESS("linethickness", new RequiredArgument("dimension")),
    LISTFIGURENAME("listfigurename", new RequiredArgument("name")),
    LISTFILES("listfiles"),
    LISTOFFIGURES("listoffigures"),
    LISTOFTABLES("listoftables"),
    LISTTABLENAME("listtablename", new RequiredArgument("name")),
    MAKEATLETTER("makeatletter"),
    MAKEATOTHER("makeatother"),
    MAKEGLOSSARY("makeglossary"),
    MAKEINDEX("makeindex"),
    MAKELABEL("makelabel"),
    MAKELABELS("makelabels", new RequiredArgument("number")),
    MAKETITLE("maketitle"),
    MBOX("mbox", new RequiredArgument("text")),
    MEDSKIP("medskip"),
    MULTICOLUMN("multicolumn", new RequiredArgument("cols"),
            new RequiredArgument("pos"), new RequiredArgument("text")),
    NEWLABEL("newlabel"),
    NEWLENGTH("newlength", new RequiredArgument("length")),
    NEWLINE("newline"),
    NEWPAGE("newpage"),
    NEWTHEOREM("newtheorem", new RequiredArgument("envname"),
            new OptionalArgument("numberedlike"), new RequiredArgument("caption"),
            new OptionalArgument("within")),
    NEWTHEOREM_STAR("newtheorem*", new RequiredArgument("envname"),
            new RequiredArgument("caption")),
    NOCITE("nocite", new RequiredArgument("keys")),
    NOFILES("nofiles"),
    NOLINEBREAK("nolinebreak", new OptionalArgument("number")),
    NONUMBER("nonumber"),
    NOPAGEBREAK("nopagebreak", new OptionalArgument("number")),
    NORMALCOLOR("normalcolor"),
    NORMALFONT("normalfont"),
    NORMALSIZE("normalsize"),
    OE("oe", "œ"),
    CAPITAL_OE("OE", "Œ"),
    ONECOLUMN("onecolumn"),
    PAGEBREAK("pagebreak", new OptionalArgument("number")),
    PAGENAME("pagename"),
    PAGENUMBERING("pagenumbering", new RequiredArgument("numstyle")),
    PAGEREF("pageref", new RequiredArgument("label")),
    PAGESTYLE("pagestyle", new RequiredArgument("style")),
    PAGETOTAL("pagetotal"),
    PARAGRAPH("paragraph", new OptionalArgument("shorttitle"),
            new RequiredArgument("title")),
    PARAGRAPH_STAR("paragraph*", new RequiredArgument("title")),
    PARAGRAPHMARK("paragraphmark"),
    PARBOX("parbox", new OptionalArgument("pos"), new RequiredArgument("width"),
            new RequiredArgument("text")),
    PART("part", new OptionalArgument("shorttitle"), new RequiredArgument("title")),
    PART_STAR("part*", new RequiredArgument("title")),
    PARTNAME("partname", new RequiredArgument("name")),
    PDFINFO("pdfinfo", new RequiredArgument("info")),
    POUNDS("pounds", "£"),
    PRINTINDEX("printindex"),
    R("r", "˚ (accent)"),
    REF("ref", new RequiredArgument("label")),
    REFNAME("refname", new RequiredArgument("name")),
    RIGHTHYPHENMIN("righthyphenmin"),
    RIGHTMARGIN("rightmargin"),
    RIGHTMARK("rightmark"),
    RMFAMILY("rmfamily"),
    ROMAN("roman", new RequiredArgument("counter")),
    CAPITAL_ROBAN("Roman", new RequiredArgument("counter")),
    RULE("rule", new OptionalArgument("line"), new RequiredArgument("width"),
            new RequiredArgument("thickness")),
    SAMEPAGE("samepage"),
    SBOX("sbox", new RequiredArgument("cmd"),
            new RequiredArgument("length")),
    SCRIPTSIZE("scriptsize"),
    SCSHAPE("scshape"),
    SECTION("section", new OptionalArgument("shorttitle"),
            new RequiredArgument("title")),
    SECTION_STAR("section", new RequiredArgument("title")),
    SELECTFONT("selectfont"),
    SETLENGTH("setlength", new RequiredArgument("cmd"),
            new RequiredArgument("length")),
    SFFAMILY("sffamily"),
    SHORTSTACK("shortstack", new OptionalArgument("pos"),
            new RequiredArgument("text")),
    SLSHAPE("slshape"),
    SMALL("small"),
    SMASH("smash"),
    SPACE("space"),
    STEPCOUNTER("stepcounter", new RequiredArgument("counter")),
    STOP("stop"),
    SUBITEM("subitem"),
    SUBPARAGRAPH("subparagraph", new OptionalArgument("shorttitle"),
            new RequiredArgument("title")),
    SUBPARAGRAPH_STAR("subparagraph*", new RequiredArgument("title")),
    SUBPARAGRAPHMARK("subparagraphmark", new RequiredArgument("code")),
    SUBSECTION("subsection", new OptionalArgument("shorttitle"),
            new RequiredArgument("title")),
    SUBSECTION_STAR("subsection*", new RequiredArgument("title")),
    SUBSECTIONMARK("subsectionmark", new RequiredArgument("code")),
    SUBSUBITEM("subsubitem"),
    SUBSUBSECTION("subsubsection", new OptionalArgument("shorttitle"),
            new RequiredArgument("title")),
    SUBSUBSECTION_STAR("subsubsection*", new RequiredArgument("title")),
    SUBSUBSECTIONMARK("subsubsectionmark", new RequiredArgument("code")),
    SUPPRESSFLOATS("suppressfloats", new OptionalArgument("placement")),
    SYMBOL("symbol", new RequiredArgument("n")),
    TABLENAME("tablename", new RequiredArgument("name")),
    TABLEOFCONTENTS("tableofcontents"),
    TEXTASCIICIRCUM("textasciicircum", "^"),
    TEXTASCIITILDE("textasciitilde", "~"),
    TEXTASTERISKCENTERED("textasciicentered", "⁎"),
    TEXTBACKSLASH("textbackslash", "\\"),
    TEXTBAR("textbar", "|"),
    TEXTBF("textbf", new RequiredArgument("text")),
    TEXTBRACELEFT("textbraceleft", "{"),
    TEXTBRACERIGHT("textbraceright", "}"),
    TEXTBULLET("textbullet", "•"),
    TEXTCIRCLED("textcircled", new RequiredArgument("text")),
    TEXTCOPYRIGHT("textcopyright", "©"),
    TEXTDAGGER("textdagger", "†"),
    TEXTDAGGERDBL("textdaggerdbl", "‡"),
    TEXTDOLLAR("textdollar", "$"),
    TEXTELLIPSIS("textellipsis", "…"),
    TEXTEMDASH("textemdash", "—"),
    TEXTENDASH("textendash", "–"),
    TEXTEXCLAMDOWN("textexclamdown", "¡"),
    TEXTGREATER("textgreater", ">"),
    TEXTHEIGHT("textheight"),
    TEXTIT("textit", new RequiredArgument("text")),
    TEXTLESS("textless"),
    TEXTMD("textmd", new RequiredArgument("text")),
    TEXTNORMAL("textnormal"),
    TEXTPARAGRAPH("textparagraph"),
    TEXTPERIODCENTERED("textperiodcentered", "·"),
    TEXTQUESTIONDOWN("textquestiondown", "¿"),
    TEXTQUOTEDBLLEFT("textquotedblleft", "“"),
    TEXTQUOTEDBLRIGHT("textquotedblright", "”"),
    TEXTQUOTELEFT("textquoteleft", "‘"),
    TEXTQUOTERIGHT("textquoteright", "’"),
    TEXTREGISTERED("textregistered", "®"),
    TEXTRM("textrm", new RequiredArgument("text")),
    TEXTSC("textsc", new RequiredArgument("textsc")),
    TEXTSECTION("textsection", "§"),
    TEXTSF("textsf", new RequiredArgument("text")),
    TEXTSL("textsl", new RequiredArgument("text")),
    TEXTSTERLING("textsterling", "£"),
    TEXTSUBSCRIPT("textsubscript", new RequiredArgument("text")),
    TEXTSUPERSCRIPT("textsuperscript", new RequiredArgument("text")),
    TEXTTRADEMARK("texttrademark", "™"),
    TEXTTT("texttt", new RequiredArgument("text")),
    TEXTUNDERSCORE("textunderscore", "_"),
    TEXTUP("textup", new RequiredArgument("text")),
    TEXTVISIBLESPACE("textvisiblespace", "␣"),
    TEXTWIDTH("textwidth"),
    THANKS("thanks", new RequiredArgument("to")),
    THICKLINES("thicklines"),
    THINLINES("thinlines"),
    THISPAGESTYLE("thispagestyle", new RequiredArgument("style")),
    TIME("time"),
    TINY("tiny"),
    TITLE("title", new RequiredArgument("text")),
    TODAY("today"),
    TTFAMILY("ttfamily"),
    TWOCOLUMN("twocolumn", new OptionalArgument("text")),
    UNBOLDMATH("unboldmath"),
    UNDERLINE("underline", new RequiredArgument("text")),
    UPSHAPE("upshape"),
    USEPACKAGE("usepackage", new OptionalArgument("options"),
            new RequiredArgument("package")),
    VDOTS("vdots", "⋮"),
    VLINE("vline"),
    VSPACE("vspace", new RequiredArgument("length")),
    VSPACE_STAR("vspace*", new RequiredArgument("length")),
    WIDTH("width"),

    /*
        New definitions
     */
    NEWCOMMAND("newcommand", new RequiredArgument("cmd"), new OptionalArgument("args"),
            new OptionalArgument("default"), new RequiredArgument("def")),
    NEWCOMMAND_STAR("newcommand*", new RequiredArgument("cmd"),
            new OptionalArgument("args"), new OptionalArgument("default"),
            new RequiredArgument("def")),
    PROVIDECOMMAND("providecommand", new RequiredArgument("cmd"),
            new OptionalArgument("args"), new OptionalArgument("default"),
            new RequiredArgument("def")),
    PROVIDECOMMAND_STAR("providecommand*", new RequiredArgument("cmd"),
            new OptionalArgument("args"), new OptionalArgument("default"),
            new RequiredArgument("def")),
    RENEWCOMMAND("renewcommand", new RequiredArgument("cmd"),
            new OptionalArgument("args"), new OptionalArgument("default"),
            new RequiredArgument("def")),
    RENEWCOMMAND_STAR("renewcommand*", new RequiredArgument("cmd"),
            new OptionalArgument("args"), new OptionalArgument("default"),
            new RequiredArgument("def")),
    NEWENVIRONMENT("newenvironment", new RequiredArgument("name"),
            new OptionalArgument("args"), new OptionalArgument("default"),
            new RequiredArgument("begdef"), new RequiredArgument("enddef")),
    RENEWENVIRONMENT("renewenvironment", new RequiredArgument("name"),
            new OptionalArgument("args"), new OptionalArgument("default"),
            new RequiredArgument("begdef"), new RequiredArgument("enddef")),;

    private static final Map<String, LatexNoMathCommand> lookup = new HashMap<>();

    static {
        for (LatexNoMathCommand command : LatexNoMathCommand.values()) {
            lookup.put(command.getCommand(), command);
        }
    }

    private String command;
    private Argument[] arguments;
    private String display;

    LatexNoMathCommand(String command, String display, Argument... arguments) {
        this(command, arguments);
        this.display = display;
    }

    LatexNoMathCommand(String command, Argument... arguments) {
        this.command = command;
        this.arguments = arguments;
    }

    public static Optional<LatexNoMathCommand> get(String command) {
        return Optional.ofNullable(lookup.get(command));
    }

    public String getCommand() {
        return command;
    }

    public String getCommandDisplay() {
        return "\\" + command;
    }

    public Argument[] getArguments() {
        return arguments;
    }

    public <T extends Argument> List<T> getArgumentsOf(Class<T> clazz) {
        List<T> requiredArguments = new ArrayList<>();

        for (Argument argument : arguments) {
            if (clazz.isAssignableFrom(argument.getClass())) {
                requiredArguments.add((T)argument);
            }
        }

        return requiredArguments;
    }

    public String getArgumentsDisplay() {
        StringBuilder sb = new StringBuilder();
        for (Argument arg : arguments) {
            sb.append(arg.toString());
        }

        return sb.toString();
    }

    public String getDisplay() {
        return display;
    }

}
