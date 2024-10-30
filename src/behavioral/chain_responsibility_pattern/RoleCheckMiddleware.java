package behavioral.chain_responsibility_pattern;

public class RoleCheckMiddleware extends Middleware {

    @Override
    protected boolean Check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello admin");
            return true;
        }
        System.out.println("Hello user");
        return CheckNext(email, password);
    }
}