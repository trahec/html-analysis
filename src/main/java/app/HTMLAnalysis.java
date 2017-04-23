package app;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.TreeMap;

public class HTMLAnalysis {

    public static HTMLData htmlData = new HTMLData();
    private static String URL;

    public enum htmlVersion {
        HTML5,
        HTML4,
        HTML3,
        HTML2,
        XHTML1,
        ISOIEC15445
    };

    // https://www.totalvalidator.com/support/doctypes.html
    private static final Map<String, htmlVersion> htmlVersionMap = new TreeMap<String, htmlVersion>(String.CASE_INSENSITIVE_ORDER){{
        put("<!DOCTYPE html>", htmlVersion.HTML5);
        put("<!DOCTYPE html SYSTEM \"about:legacy-compat\">", htmlVersion.HTML5);
        put("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML+ARIA 1.0//EN\" \"http://www.w3.org/WAI/ARIA/schemata/xhtml-aria-1.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML+RDFa 1.1//EN\" \"http://www.w3.org/MarkUp/DTD/xhtml-rdfa-2.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML+RDFa 1.0//EN\" \"http://www.w3.org/MarkUp/DTD/xhtml-rdfa-1.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML Basic 1.1//EN\" \"http://www.w3.org/TR/xhtml-basic/xhtml-basic11.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML-Print 1.0//EN\" \"http://www.w3.org/TR/xhtml-print/xhtml-print10.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.2//EN\" \"http://www.openmobilealliance.org/tech/DTD/xhtml-mobile12.dtd\">", htmlVersion.XHTML1);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML+ARIA 1.0//EN\" \"http://www.w3.org/WAI/ARIA/schemata/html4-aria-1.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01+RDFa 1.1//EN\" \"http://www.w3.org/MarkUp/DTD/html401-rdfa11-1.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01+RDFa Lite 1.1//EN\" \"http://www.w3.org/MarkUp/DTD/html401-rdfalite11-1.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01+RDFa 1.0//EN\" \"http://www.w3.org/MarkUp/DTD/html401-rdfa-1.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\" \"http://www.w3.org/TR/REC-html40/loose.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Frameset//EN\" \"http://www.w3.org/TR/REC-html40/frameset.dtd\">", htmlVersion.HTML4);
        put("<!DOCTYPE html PUBLIC \"ISO/IEC 15445:2000//DTD HTML//EN\">", htmlVersion.ISOIEC15445);
        put("<!DOCTYPE html PUBLIC \"ISO/IEC 15445:2000//DTD HyperText Markup Language//EN\">", htmlVersion.ISOIEC15445);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">", htmlVersion.HTML3);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2//EN\">", htmlVersion.HTML3);
        put("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2 Draft//EN\">", htmlVersion.HTML3);
        put("<!DOCTYPE HTML PUBLIC \"-//IETF//DTD HTML//EN\">", htmlVersion.HTML2);
        put("<!DOCTYPE HTML PUBLIC \"-//IETF//DTD HTML 2.0//EN\">", htmlVersion.HTML2);
    }};

    /*
     * call analysis functions
     * return HTMLData Object
    */
    public static Document getHTMLDocument(String inputUrl) throws IOException {
        URL = inputUrl;
        Document document = null;
        try {
            document = Jsoup.connect(inputUrl).get();
        }
        catch (UnknownHostException e){
            e.printStackTrace();
        }
        return document;
    }

    public static HTMLData analyseDocument(Document document){
        analysePageTitle(document);
        analyseHtmlVersion(document);
        analyseHeadings(document);
        analyseLinks(document, URL);
        detectLoginForm(document, URL);
        return htmlData;
    }

    public static void analysePageTitle(Document document){
        String title = document.getElementsByTag("title").text();
        if(title != null && !title.equals("")){
            htmlData.pageTitle = title;
        }
        else{
            htmlData.pageTitle = null;
        }
    }

    public static void analyseHtmlVersion(Document document){
        DocumentType docType = (DocumentType) document.childNodes().get(0);//why not  document.childNodes[0]
        if(htmlVersionMap.containsKey(docType.toString())){
            htmlData.htmlVersion = htmlVersionMap.get(docType.toString()).toString();
        }
        else{
            htmlData.htmlVersion = "Invalid HTML Version";
        }
    }

    public static void analyseHeadings(Document document){
        Elements hTags = document.select("h1, h2, h3, h4, h5, h6");
        htmlData.numberOfHeadings = hTags.size();
        htmlData.numberOfh1Tags = hTags.select("h1").size();
        htmlData.numberOfh2Tags = hTags.select("h2").size();
        htmlData.numberOfh3Tags = hTags.select("h3").size();
        htmlData.numberOfh4Tags = hTags.select("h4").size();
        htmlData.numberOfh5Tags = hTags.select("h5").size();
        htmlData.numberOfh6Tags = hTags.select("h6").size();
    }

    public static void analyseLinks(Document document, String inputUrl){
        Elements allLinks = document.select("a");
        htmlData.numberOfLinks = allLinks.size();
        try {
            String inputDomainName = URLAnalysis.getDomainName(inputUrl);
            for(Element link : allLinks){
                String href = link.absUrl("href");
                String hrefDomainName = URLAnalysis.getDomainName(href);
                if(hrefDomainName.contains(inputDomainName)){
                    htmlData.numberOfInternalLinks+=1;
                }
                else{
                    htmlData.numberOfExternalLinks+=1;
                }
            }
        }
        catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void detectLoginForm(Document document, String inputUrl){
        try {
            String urlPath = URLAnalysis.getPath(inputUrl);
            if(urlPath.contains("login")){
                htmlData.containsLoginForm = true;
                return;
            }
            Elements allForms = document.select("form");
            for(Element form : allForms){
                Elements loginIds = form.getElementsByAttributeValueContaining("id", "login");
                Elements passwordIds = form.getElementsByAttributeValueContaining("id", "pass");
                Elements loginClasses = form.getElementsByAttributeValueContaining("class", "login");
                Elements passwordClasses = form.getElementsByAttributeValueContaining("class", "pass");
                Elements loginNames = form.getElementsByAttributeValueContaining("name", "login");
                Elements passwordNames = form.getElementsByAttributeValueContaining("name", "pass");

                if(!loginIds.isEmpty() || !loginClasses.isEmpty() || !loginNames.isEmpty()
                        && !passwordIds.isEmpty() || !passwordClasses.isEmpty() || !passwordNames.isEmpty() )
                {
                    htmlData.containsLoginForm = true;
                    return;
                }
            }
            htmlData.containsLoginForm = false;
        }
        catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}