package ulpgc;

import spark.*;

public class Main {
    public static void main(String[] args) {
        Spark.port(8080);
        Spark.get("/texto/:name", (request, response) -> new Texto(request, response).execute());
    }
}
