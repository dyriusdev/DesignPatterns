package behavioral.chain_responsibility_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void Init() {
        server = new Server();
        server.Register("admin@example.com", "admin");
        server.Register("user@example.com", "user");

        Middleware middleware = Middleware.Link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.SetMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        Init();

        boolean success;
        do {
            System.out.println("Enter email : ");
            String email = reader.readLine();
            System.out.println("Enter password : ");
            String password = reader.readLine();
            success = server.Login(email, password);
        } while (!success);
    }
}