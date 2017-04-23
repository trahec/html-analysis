import app.HTMLAnalysis;
import org.jsoup.Jsoup;
import static org.junit.Assert.*;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class TestHtmlAnalysis {

    HTMLAnalysis htmlAnalysis = new HTMLAnalysis();

    //Test HTMLAnalysis.analyseTitlePage
    @Test
    public void testAnalysePageTitleNoTitle(){
        Document document = Jsoup.parse("<!DOCTYPE html><html><body><h1>Sample Heading</h1><p>Paragraph</p></body></html>");
        htmlAnalysis.analysePageTitle(document);
        assertNull(htmlAnalysis.htmlData.pageTitle);
    }

    @Test
    public void testAnalysePageTitleWithTitle(){
        Document document = Jsoup.parse(
                "<!DOCTYPE html><html><head><title>TestTitle</title></head>" +
                        "<body><h1>Sample Heading</h1><p>Paragraph</p></body></html>");
        htmlAnalysis.analysePageTitle(document);
        assertEquals("TestTitle", htmlAnalysis.htmlData.pageTitle);
    }

    //Test analyseHTMLVersion
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

    //Test anaylyseHeadings
    @Test
    public void testAnalyseHeadings(){
        Document document = Jsoup.parse(
                "<!DOCTYPE html><head><title>TestTitle</title></head><body> " +
                        "<h1>This is heading 1</h1>\n" +
                        "<h2>This is heading 2</h2>\n" +
                        "<h2>This is also heading 2</h2>\n" +
                        "<h5>This is heading 5</h5>\n" +
                        "<h6>This is heading 6</h6>" +
                        "</body></html>");
        htmlAnalysis.analyseHeadings(document);
        assertEquals(5, htmlAnalysis.htmlData.numberOfHeadings);
        assertEquals(1, htmlAnalysis.htmlData.numberOfh1Tags);
        assertEquals(2, htmlAnalysis.htmlData.numberOfh2Tags);
        assertEquals(0, htmlAnalysis.htmlData.numberOfh3Tags);
        assertEquals(0, htmlAnalysis.htmlData.numberOfh4Tags);
        assertEquals(1, htmlAnalysis.htmlData.numberOfh5Tags);
        assertEquals(1, htmlAnalysis.htmlData.numberOfh6Tags);
    }
}