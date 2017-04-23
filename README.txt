CONTENTS OF THIS FILE
---------------------
 * Introduction
 * Dependencies
 * Assumptions, Limitations and Constraints
 * Build & Run

 
INTRODUCTION
------------
Web application that allows a user to conduct some analysis of an HTML web page


DEPENDENCIES
------------
-Maven 4.0.0
-JDK 8
-Spark 2.5: Java Web Framework http://sparkjava.com/


ASSUMPTIONS, LIMITATIONS AND CONSTRAINTS
----------------------------------------
*HTML Version analysis
Since there is no standard HTML Version tag, I made the assumption that the valid doctypes of a HTML Page 
must be one of those from https://www.totalvalidator.com/support/doctypes.html

*Headings Analysis
The requirement stated: Number of headings grouped by heading level.
Since there are 6 standard heading tags (h1-h6), I listed all heading levels and gave those not available the value 0.

*Dynamic web pages not always correct
Example: https://login.oracle.com/mysso/signon.jsp in web browser shows a login form, but detectLoginForm returns false,
because oracle does not allow 'bookmarked URLs' and returns an error page when the url is pasted into the text input

*Hypermedia links analysis task
Implemented a HashMap with key=domainUrl and value=HashMap of links belonging to that domainUrl.
Then if domainUrl is unavailable, we can assume the sublinks are also unavailable.
Testing the availability:
I first tried InetAddress#isReachable(), however that does not deal with redirection.
Then used HttpURLConnection, which deals with redirection, however it is quite slow with pages with a lot of links(eg. https://www.wikipedia.org/)
It may be worthwhile to implement threading along with InetAddress#isReachable()

BUILD & RUN
-----------
1. Extract html-analysis-src.zip in <somedir>
    Command: unzip 
2. Go to <somedir>/html-analysis-src/
    Command: cd <somedir>/html-analysis-src/
3. Build the project with maven
    Command: mvn package
4. Run the application from <somedir>/html-analysis-src/
    Command: mvn exec:java -Dexec.mainClass="app.Application"
5. Open http://localhost:4567/index in a web browser