package ulpgc;

import spark.*;

public class Texto implements CommandsExecutor{
    private final Request request;
    private final Response response;

    public Texto(Request request, Response response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public String execute() {
        String name = request.params(":name");
        return "Bienvenido de nuevo, " + name + "!";
    }
}
