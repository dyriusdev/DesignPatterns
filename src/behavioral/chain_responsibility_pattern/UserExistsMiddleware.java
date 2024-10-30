package behavioral.chain_responsibility_pattern;

public class UserExistsMiddleware extends Middleware {

    private final Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    protected boolean Check(String email, String password) {
        if (!server.HasEmail(email)) {
            System.out.println("This email is not registered");
            return false;
        }

        if (!server.IsValidPassword(email, password)) {
            System.out.println("Wrong password");
            return false;
        }

        return CheckNext(email, password);
    }
}