package app;
import static spark.Spark.*;

public class Application {
    //create UserInterfaceController Object

    public static void main(String[] args) {
        //UserInterfaceController.renderTextInput
        //pass that text input when /index is called
        get("/index", (req, res) -> "Hello World..");

        //handle input
        //pass input to UserInterfaceController.renderResponseTable
        //display table
    }
}