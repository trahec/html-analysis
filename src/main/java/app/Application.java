package app;

import static spark.Spark.*;

public class Application {
    //create UserInterfaceController Object
    private static UserInterfaceController userInterfaceController = new UserInterfaceController();

    public static void main(String[] args) {
        //UserInterfaceController.renderTextInput
        //pass that text input when /index is called
        //get("/index", (req, res) -> "Hello World..");

        //handle input
        String inputUrl = "http://wikipedia.org";
        userInterfaceController.renderResponseTable(inputUrl);
        //display table
    }
}