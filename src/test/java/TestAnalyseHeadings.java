import app.HTMLAnalysis;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnalyseHeadings {

    private static HTMLAnalysis htmlAnalysis = new HTMLAnalysis();

    @BeforeClass
    public static void setUpDocument(){
        Document document = Jsoup.parse(
                "<!DOCTYPE html><head><title>TestTitle</title></head><body> " +
                        "<h1>This is heading 1</h1>\n" +
                        "<h2>This is heading 2</h2>\n" +
                        "<h2>This is also heading 2</h2>\n" +
                        "<h5>This is heading 5</h5>\n" +
                        "<h6>This is heading 6</h6>" +
                        "</body></html>");
        htmlAnalysis.analyseHeadings(document);
    }

    @Test
    public void testTotalNumberOfHeadings(){
        assertEquals(5, htmlAnalysis.htmlData.numberOfHeadings);
    }

    @Test
    public void testNumberOfh1Tags(){
        assertEquals(1, htmlAnalysis.htmlData.numberOfh1Tags);
    }

    @Test
    public void testNumberOfh2Tags(){
        assertEquals(2, htmlAnalysis.htmlData.numberOfh2Tags);
    }

    @Test
    public void testNumberOfh3Tags(){
        assertEquals(0, htmlAnalysis.htmlData.numberOfh3Tags);
    }

    @Test
    public void testNumberOfh4Tags(){
        assertEquals(0, htmlAnalysis.htmlData.numberOfh4Tags);
    }

    @Test
    public void testNumbersOfh5Tags(){
        assertEquals(1, htmlAnalysis.htmlData.numberOfh5Tags);
    }

    @Test
    public void testNumberOfh6Tags(){
        assertEquals(1, htmlAnalysis.htmlData.numberOfh6Tags);
    }
}