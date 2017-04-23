package TestHTMLAnalysis;

import app.HTMLAnalysis;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestDetectLoginForm {

    private static HTMLAnalysis htmlAnalysis = new HTMLAnalysis();
    private static Document commonHtmlDocument;
    private static Document germanHtmlDocument;
    private static Document uncommonDocument;
    private static Document noLoginFormDocument;

    @BeforeClass
    public static void setUpDocuments(){
        commonHtmlDocument = Jsoup.parse(
                "<html lang=\"en\">\n" +
                        "<body class=\"body\"><form accept-charset=\"UTF-8\" action=\"/session\" method=\"post\">\n" +
                        "<div style=\"margin:0;padding:0;display:inline\">\n" +
                        "<input name=\"utf8\" value=\"✓\" type=\"hidden\">\n" +
                        "<input name=\"authenticity_token\" value=\"I4RVe0vidyMVUO7JBfCR0guh5WWENua1JEDGLkvOBDlh2nOLrGalk03WLgcMpgFgYzo7a5D+uD/3ZtFdpNofBw==\" type=\"hidden\">\n" +
                        "</div>\n" +
                        "<div class=\"auth-form-header p-0\"><h1>Sign in to GitHub</h1></div>\n" +
                        "<div id=\"js-flash-container\"></div>\n" +
                        "<div class=\"auth-form-body mt-3\">\n" +
                        "<label for=\"login_field\">Username or email address</label>\n" +
                        "<input autocapitalize=\"off\" autocorrect=\"off\" autofocus=\"autofocus\" class=\"form-control input-block\" id=\"login_field\" name=\"login\" tabindex=\"1\" type=\"text\">\n" +
                        "<label for=\"password\">Password <a href=\"/password_reset\" class=\"label-link\">Forgot password?</a></label>\n" +
                        "<input class=\"form-control form-control input-block\" id=\"password\" name=\"password\" tabindex=\"2\" type=\"password\">\n" +
                        "<input class=\"btn btn-primary btn-block\" data-disable-with=\"Signing in…\" name=\"commit\" tabindex=\"3\" value=\"Sign in\" type=\"submit\">\n" +
                        "</div>\n" +
                        "</form>\n" +
                        "</body></html>");

        germanHtmlDocument = Jsoup.parse(
                "<form class=\"ms-form\" method=\"post\" target=\"_top\" action=\"/meinspiegel/login.html\">\n" +
                        "<input name=\"backUrl\" value=\"\" type=\"hidden\">\n" +
                        "<div class=\"row\">\n" +
                        "<label for=\"f.loginName\">Benutzername oder E-Mail-Adresse</label>\n" +
                        "<input id=\"f.loginName\" name=\"f.loginName\" value=\"\" type=\"text\">\n" +
                        "</div>\n" +
                        "<div class=\"row\">\n" +
                        "<label for=\"f.password\">Passwort</label>\n" +
                        "<input id=\"f.password\" name=\"f.password\" value=\"\" type=\"password\">\n" +
                        "<span class=\"small-info right\"><a target=\"_top\" href=\"/meinspiegel/newpassword.html\">Sie haben Ihr Passwort vergessen?</a></span>\n" +
                        "</div>\n" +
                        "<div class=\"row autologin\">\n" +
                        "<input class=\"checkbox-fa\" id=\"f.returnAutologin\" name=\"f.returnAutologin\" type=\"checkbox\">\n" +
                        "<label for=\"f.returnAutologin\">Automatisches Login</label>\n" +
                        "<span class=\"small-info\"><a href=\"/meinspiegel/artikel/a-703605.html\" target=\"_blank\">Was macht diese Funktion?</a></span>\n" +
                        "</div>\n" +
                        "<div class=\"row\">\n" +
                        "<input class=\"form-button\" value=\"Anmelden\" type=\"submit\">\n" +
                        "</div>\n" +
                        "</form>");

        uncommonDocument = Jsoup.parse(
                "<form method=\"post\" action=\"https://www.reddit.com/post/login\" id=\"login_login-main\" class=\"login-form login-form-side\">\n" +
                        "<input name=\"op\" value=\"login-main\" type=\"hidden\"><input name=\"user\" placeholder=\"username\" maxlength=\"20\" tabindex=\"1\" type=\"text\"><input name=\"passwd\" placeholder=\"password\" tabindex=\"1\" type=\"password\">\n" +
                        "<div class=\"g-recaptcha\" data-sitekey=\"6LeTnxkTAAAAAN9QEuDZRpn90WwKk_R1TRW_g-JC\"></div>\n" +
                        "<div class=\"status\"></div>\n" +
                        "<div id=\"remember-me\"><input name=\"rem\" id=\"rem-login-main\" tabindex=\"1\" type=\"checkbox\"><label for=\"rem-login-main\">remember me</label><a class=\"recover-password\" href=\"/password\">reset password</a></div>\n" +
                        "<div class=\"submit\"><span class=\"throbber\"></span><button class=\"btn\" type=\"submit\" tabindex=\"1\">login</button></div>\n" +
                        "<div class=\"clear\"></div>\n" +
                        "</form>");

        noLoginFormDocument = Jsoup.parse(
                " <form action=\"/action_page.php\">\n" +
                        "  First name:<br>\n" +
                        "  <input type=\"text\" name=\"firstname\" value=\"Mickey\"><br>\n" +
                        "  Last name:<br>\n" +
                        "  <input type=\"text\" name=\"lastname\" value=\"Mouse\"><br><br>\n" +
                        "  <input type=\"submit\" value=\"Submit\">\n" +
                        "</form> ");
    }

    @Test
    public void testDetectLoginFormCommon(){
        htmlAnalysis.detectLoginForm(commonHtmlDocument, "https://github.com/login");
        assertTrue(htmlAnalysis.htmlData.containsLoginForm);
    }

    @Test
    public void testDetectLoginFormGerman(){
        htmlAnalysis.detectLoginForm(germanHtmlDocument, "https://www.spiegel.de/meinspiegel/login.html");
        assertTrue(htmlAnalysis.htmlData.containsLoginForm);
    }

    @Test
    public void testDetectLoginFormFormNoIdsUsed(){
        htmlAnalysis.detectLoginForm(uncommonDocument, "https://www.reddit.com/login");
        assertTrue(htmlAnalysis.htmlData.containsLoginForm);
    }

    @Test
    public void testDetectLoginFormNoLoginResource(){
        htmlAnalysis.detectLoginForm(uncommonDocument, "https://www.reddit.com");
        assertTrue(htmlAnalysis.htmlData.containsLoginForm);
    }

    @Test
    public void testDetectLoginFormNoLoginForm(){
        htmlAnalysis.detectLoginForm(noLoginFormDocument, "https://www.reddit.com");
        assertFalse(htmlAnalysis.htmlData.containsLoginForm);
    }
}