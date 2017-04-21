package app;

public class UserInterfaceController {

    //constructor

    //renderTextInput using j2html

    public static String renderResponseTable(String inputUrl) {
        HTMLAnalysis htmlAnalysis = new HTMLAnalysis();
        HTMLData result = htmlAnalysis.analyseURL(inputUrl);
        System.out.println("Page Title: " + result.pageTitle);

        //table = using j2html, creates table with HTMLData attributes
        String resultTable = "<table></table>";
        return resultTable;
    }
}