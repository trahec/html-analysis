package TestHTMLAnalysis;

import app.HTMLAnalysis;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnalyseHtmlVersion {

    HTMLAnalysis htmlAnalysis = new HTMLAnalysis();

    @Test
    public void testHtmlVersionValidVersion(){
        Document document = Jsoup.parse(
                "<!DOCTYPE html PUBLIC \"ISO/IEC 15445:2000//DTD HTML//EN\">" +
                        "<head><title>TestTitle</title></head>" +
                        "<body><h1>Sample Heading</h1><p>Paragraph</p></body></html>");
        htmlAnalysis.analyseHtmlVersion(document);
        assertEquals("ISOIEC15445", htmlAnalysis.htmlData.htmlVersion);
    }

    @Test
    public void testHtmlVersionInvalidVersion() {
        Document document = Jsoup.parse(
                "<!DOCTYPE INVALID>" +
                        "<head><title>TestTitle</title></head>" +
                        "<body><h1>Sample Heading</h1><p>Paragraph</p></body></html>");
        htmlAnalysis.analyseHtmlVersion(document);
        assertEquals("Invalid HTML Version", htmlAnalysis.htmlData.htmlVersion);
    }
}