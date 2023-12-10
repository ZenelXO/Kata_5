package ulpgc;

import spark.*;

public class Pow implements CommandsExecutor{
    private final Request request;
    private final Response response;

    public Pow(Request request, Response response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public String execute() {
        int param1 = Integer.parseInt(request.params(":number1"));
        int param2 = Integer.parseInt(request.params(":number2"));
        int result = (int) Math.pow(param1, param2);

        return "El resultado de elevar " + param1 + " a " + param2 + " es: " + result;
    }
}
