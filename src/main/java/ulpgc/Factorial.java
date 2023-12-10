package ulpgc;

import spark.Request;
import spark.Response;

public class Factorial implements CommandsExecutor{
    private final Request request;
    private final Response response;

    public Factorial(Request request, Response response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public String execute() {
        int param = Integer.parseInt(request.params(":number"));
        int factorial = param;
        for(int i=1; i<param; i++){
            factorial *= i;
        }
        return "El factorial del número " + param + " es: " + factorial;
    }
}
