package ulpgc;

import spark.*;

public class Main {
    public static void main(String[] args) {
        Spark.port(8080);
        Spark.get("/texto/:name", (request, response) -> new Texto(request, response).execute());
        Spark.get("/factorial/:number", (request, response) -> new Factorial(request, response).execute());
        Spark.get("/potencia/:number1/:number2", (request, response) -> new Pow(request, response).execute());
    }
}
