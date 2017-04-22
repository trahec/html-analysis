package app;

import static spark.Spark.*;

public class Application {
    private static UserInterfaceController userInterfaceController = new UserInterfaceController();

    public static void main(String[] args) {
        get("/index", (req, res) -> UserInterfaceController.renderIndexPage());

        //handle input
        String inputUrl = "http://wikipedia.org";
        userInterfaceController.renderResponseTable(inputUrl);
        //display table
    }
}