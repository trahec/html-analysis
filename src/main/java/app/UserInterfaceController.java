package app;

import j2html.tags.Tag;

import static j2html.TagCreator.form;

public class UserInterfaceController {

    public static Tag renderIndexPage(){
        Tag urlForm = form().withMethod("post").with(
            HTMLBuilder.textBoxInput("url", "URL to be analysed"),
            HTMLBuilder.submitButton("Submit")
        );
        return urlForm;
    }

    public static String renderResponseTable(String inputUrl) {
        HTMLAnalysis htmlAnalysis = new HTMLAnalysis();
        HTMLData result = htmlAnalysis.analyseURL(inputUrl);
        System.out.println("Page Title: " + result.pageTitle);

        //table = using j2html, creates table with HTMLData attributes
        String resultTable = "<table></table>";
        return resultTable;
    }
}