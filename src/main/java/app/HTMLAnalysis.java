package app;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;

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

    //analyseHeadings
        //use JSOUP to get all headings h1, h2, h3, h4
        //assigns to HTMLData.numberOfH<n>
        //sum off all headings assigned to HTMLData.numberOfHeadings

    //analyseLinks
        //uses JSOUP to get all links
        //for each link, getDomain
        //if linkDomain == urlDomain, then HTML.numberOfInternalLinks+=1
        //else then HTML.numberOfExternalLinks+=1

    //analyseForLoginForm
        //logic to detect login form in multiple ways and languages
        //assign true or false to HTML.containsLoginForm
}