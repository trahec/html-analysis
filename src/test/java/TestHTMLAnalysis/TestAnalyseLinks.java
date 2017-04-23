package TestHTMLAnalysis;

import app.HTMLAnalysis;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnalyseLinks {

    private static HTMLAnalysis htmlAnalysis = new HTMLAnalysis();

    @BeforeClass
    public static void setUpDocument(){
        Document document = Jsoup.parse(
                "<!DOCTYPE html><head><title>TestTitle</title></head><body> " +
                        "<a href=\"http://www.amazon.com\">link text</a>\n" +
                        "<a href=\"http://www.wikipedia.com\">link text</a>\n" +
                        "<a href=\"http://https://www.amazon.com/b/ref=nav_cs_gc_registry?ie=UTF8&node=14069511011\">text</a>\n" +
                        "</body></html>");
        htmlAnalysis.analyseLinks(document, "http://amazon.com");

    }

    @Test
    public void testTotalNumbersOfLinks(){
        assertEquals(3, htmlAnalysis.htmlData.numberOfLinks);
    }

    @Test
    public void testNumberOfInternalLinks(){
        assertEquals(2, htmlAnalysis.htmlData.numberOfInternalLinks);
    }

    @Test
    public void testNumbersOfExternalLinks(){
        assertEquals(1, htmlAnalysis.htmlData.numberOfExternalLinks);
    }
}