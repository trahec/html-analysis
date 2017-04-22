package app;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;

import javax.swing.text.html.HTML;
import java.io.IOException;

public class HTMLAnalysis {

    private static HTMLData htmlData = new HTMLData();
    private static Document document;
    private static String url;

    /*
     * call analysis functions
     * return HTMLData Object
    */
    public static HTMLData analyseURL(String inputUrl){
        url = inputUrl;
        try{
            document = Jsoup.connect(url).get();
            //call all analysis functions
            analysePageTitle(document);
            analyseHtmlVersion(document);
            analyseHeadings(document);
        }
        catch(IOException e){
            System.out.println(e);
        }
        return htmlData;
    }

    private static void analysePageTitle(Document document){
        String title = document.getElementsByTag("title").text();
        if(title != null){
            HTMLData.pageTitle = title;
        }
    }

    //analyseHTMLVersion
    private static void analyseHtmlVersion(Document document){
        DocumentType docType = (DocumentType) document.childNodes().get(0);//why not  document.childNodes[0]
        String docTypePublicId = docType.attr("publicid");
        if(docTypePublicId.equals("")){
            HTMLData.htmlVersion = "HTML5";
        }
        else{
            //extract version from publicid
        }
    }

    private static void analyseHeadings(Document document){
        Elements hTags = document.select("h1, h2, h3, h4, h5, h6");
        htmlData.numberOfHeadings = hTags.size();
        htmlData.numberOfh1Tags = hTags.select("h1").size();
        htmlData.numberOfh2Tags = hTags.select("h2").size();
        htmlData.numberOfh3Tags = hTags.select("h3").size();
        htmlData.numberOfh4Tags = hTags.select("h4").size();
        htmlData.numberOfh5Tags = hTags.select("h5").size();
        htmlData.numberOfh6Tags = hTags.select("h6").size();
    }

    //analyseLinks
        //uses JSOUP to get all links
        //for each link, getDomain
        //if linkDomain == urlDomain, then HTML.numberOfInternalLinks+=1
        //else then HTML.numberOfExternalLinks+=1

    //analyseForLoginForm
        //logic to detect login form in multiple ways and languages
        //assign true or false to HTML.containsLoginForm
}