package app;

public class HTMLAnalysis {

    //HTMLData Object class variable
    //JSOUP Object

    //constructor
        //takes url as input, assigns to class variable

    //analyseURL
        //call analysis functions
        //return HTMLData Object

    //analysePageTitle
        //uses JSOUP to get title element
        //assigns to HTMLData.pageTitle

    //analyseHTMLVersion
        //uses JSOUP to get version element
        //may need regex to extract version
        //assigns to HTMLData.htmlVersion

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