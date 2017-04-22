package app;

import static spark.Spark.*;

public class Application {
    private static UserInterfaceController userInterfaceController = new UserInterfaceController();

    public static void main(String[] args) {
        get("/index", (req, res) ->
                UserInterfaceController.renderIndexPage()
        );
        post("/action", (req, res) ->
                UserInterfaceController.renderResponseTable(req.queryParams("url"))
        );
    }
}