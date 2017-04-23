CONTENTS OF THIS FILE
---------------------
 * Introduction
 * Technologies
 * Assumptions, Limitations and Constraints
 * Build & Run

 
INTRODUCTION
------------
Web application that allows a user to conduct some analysis of an HTML web page


TECHNOLOGIES
------------
-Maven 4.0.0
-JDK 8
-Spark 2.5: Java Web Framework http://sparkjava.com/


ASSUMPTIONS, LIMITATIONS AND CONSTRAINTS
----------------------------------------
*HTML Version analysis:
Since there is no standard HTML Version tag, I made the assumption that the valid doctypes of a HTML Page 
must be one of those from https://www.totalvalidator.com/support/doctypes.html

*Headings Analysis:
The requirement stated: Number of headings grouped by heading level.
Since there are 6 standard heading tags (h1-h6), I listed all heading levels and gave those not available the value 0.


BUILD & RUN
-----------
1. Extract html-analysis-sourcefiles.zip in <somedir>
    Command: unzip 
2. Go to <somedir>/html-analysis-sourcefiles/
    Command: cd <somedir>/html-analysis-sourcefiles/
3. Build the project
    Command: mvn --package
4. Run the application from <somedir>/html-analysis-sourcefiles/
    Command: mvn exec:java -Dexec.mainClass="app.Application"
5. Open http://localhost:4567/index in a web browser