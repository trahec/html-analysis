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
}