package behavioral.chain_responsibility_pattern;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void SetMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean Login(String email, String password) {
        if (middleware.Check(email, password)) {
            System.out.println("Authentication have been successful");
            return true;
        }
        return false;
    }

    public void Register(String email, String password) {
        users.put(email, password);
    }

    public boolean HasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean IsValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}