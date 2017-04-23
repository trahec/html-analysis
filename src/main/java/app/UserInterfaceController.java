package app;

import j2html.tags.Tag;

import org.jsoup.HttpStatusException;
import org.jsoup.nodes.Document;

import java.io.IOException;
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
        Document document = null;
        if(!URLAnalysis.isValidUrl(inputUrl)){
            Tag error = div().with( p("Invlid URL provided: " + inputUrl));
            return HTMLBuilder.htmlTemplate(error);
        }
        //get html document
        try {
            document = htmlAnalysis.getHTMLDocument(inputUrl);
        }
        catch (IOException e) {
            Tag error = div().with( p("Error reaching the domain: " + inputUrl));
            return HTMLBuilder.htmlTemplate(error);
        }
        if(document != null){
            HTMLData htmlAnalysisResult = htmlAnalysis.analyseDocument(document);
            Tag resultTable = table().withText("Analysed URL: " + inputUrl).with(
                    getTableRowList(htmlAnalysisResult)
            );
            return HTMLBuilder.htmlTemplate(resultTable);
        }
        else{
            Tag error = div().with( p("HTML Document not found. Is URL valid? " + inputUrl));
            return HTMLBuilder.htmlTemplate(error);
        }
    }

    private static List<Tag> getTableRowList(HTMLData htmlData){
        ArrayList<Tag> tableRowList = new ArrayList<>();
        tableRowList.add(tr().with(td("HTML Version"), td(htmlData.htmlVersion)));
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