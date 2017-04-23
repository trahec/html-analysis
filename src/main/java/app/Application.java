package app;

import static spark.Spark.*;

public class Application {
    public static void main(String[] args) {
        get("/index", (req, res) ->
                UserInterfaceController.renderIndexPage()
        );
        post("/action", (req, res) ->
                UserInterfaceController.renderResponseTable(req.queryParams("url"))
        );
    }
}