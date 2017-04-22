package app;

import j2html.tags.Tag;

import java.util.ArrayList;
import java.util.List;

import static j2html.TagCreator.*;

public class UserInterfaceController {

    public static Tag renderIndexPage(){
        Tag urlForm = form().withMethod("post").withAction("/action").with(
            HTMLBuilder.textBoxInput("url", "URL to be analysed"),
            HTMLBuilder.submitButton("Submit")
        );
        return HTMLBuilder.htmlTemplate(urlForm);
    }

    public static Tag renderResponseTable(String inputUrl) {
        HTMLAnalysis htmlAnalysis = new HTMLAnalysis();
        HTMLData htmlAnalysisResult = htmlAnalysis.analyseURL(inputUrl);
        Tag resultTable = table().with(
            getTableRowList(htmlAnalysisResult)
        );
        return HTMLBuilder.htmlTemplate(resultTable);
    }

    private static List<Tag> getTableRowList(HTMLData htmlData){
        ArrayList<Tag> tableRowList = new ArrayList<>();
        if (htmlData.htmlVersion != null) {
            tableRowList.add(tr().with(td("HTML Version"), td(htmlData.htmlVersion)));
        }
        if (htmlData.pageTitle != null) {
            tableRowList.add(tr().with(td("Page Title"), td(htmlData.pageTitle)));
        }
        tableRowList.add(tr().with(td("Total number of headings"), td(Integer.toString(htmlData.numberOfHeadings))));
        tableRowList.add(tr().with(td("Number of h1 headings"), td(Integer.toString(htmlData.numberOfh1Tags))));
        tableRowList.add(tr().with(td("Number of h2 headings"), td(Integer.toString(htmlData.numberOfh2Tags))));
        tableRowList.add(tr().with(td("Number of h3 headings"), td(Integer.toString(htmlData.numberOfh3Tags))));
        tableRowList.add(tr().with(td("Number of h4 headings"), td(Integer.toString(htmlData.numberOfh4Tags))));
        tableRowList.add(tr().with(td("Number of h5 headings"), td(Integer.toString(htmlData.numberOfh5Tags))));
        tableRowList.add(tr().with(td("Number of h6 headings"), td(Integer.toString(htmlData.numberOfh6Tags))));
        tableRowList.add(tr().with(td("Total number of links"), td(Integer.toString(htmlData.numberOfLinks))));
        tableRowList.add(tr().with(td("Number of external links"), td(Integer.toString(htmlData.numberOfExternalLinks))));
        tableRowList.add(tr().with(td("Number of external links"), td(Integer.toString(htmlData.numberOfInternalLinks))));
        tableRowList.add(tr().with(td("Does the page contain a login form?"), td(Boolean.toString(htmlData.containsLoginForm))));
        return tableRowList;
    }
}