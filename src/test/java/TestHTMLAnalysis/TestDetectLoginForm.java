package TestHTMLAnalysis;

import app.HTMLAnalysis;
import org.junit.Test;
import resources.TestHtmlDocuments;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestDetectLoginForm {

    private static HTMLAnalysis htmlAnalysis = new HTMLAnalysis();

    @Test
    public void testDetectLoginFormCommon(){
        htmlAnalysis.detectLoginForm(TestHtmlDocuments.commonHtmlDocument, "https://github.com/login");
        assertTrue(htmlAnalysis.htmlData.containsLoginForm);
    }

    @Test
    public void testDetectLoginFormGerman(){
        htmlAnalysis.detectLoginForm(TestHtmlDocuments.germanHtmlDocument, "https://www.spiegel.de/meinspiegel/login.html");
        assertTrue(htmlAnalysis.htmlData.containsLoginForm);
    }

    @Test
    public void testDetectLoginFormFormNoIdsUsed(){
        htmlAnalysis.detectLoginForm(TestHtmlDocuments.uncommonDocument, "https://www.reddit.com/login");
        assertTrue(htmlAnalysis.htmlData.containsLoginForm);
    }

    @Test
    public void testDetectLoginFormNoLoginResource(){
        htmlAnalysis.detectLoginForm(TestHtmlDocuments.uncommonDocument, "https://www.reddit.com");
        assertTrue(htmlAnalysis.htmlData.containsLoginForm);
    }

    @Test
    public void testDetectLoginFormNoLoginForm(){
        htmlAnalysis.detectLoginForm(TestHtmlDocuments.noLoginFormDocument, "https://www.reddit.com");
        assertFalse(htmlAnalysis.htmlData.containsLoginForm);
    }

    @Test
    public void testDetectLoginFormNoLoginFormHTTPS(){
        htmlAnalysis.detectLoginForm(TestHtmlDocuments.fullHTMLDocumentNoLogin, "http://www.theregister.co.uk/");
        assertFalse(htmlAnalysis.htmlData.containsLoginForm);
    }
}