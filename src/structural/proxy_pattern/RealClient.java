package structural.proxy_pattern;

public class RealClient implements IClient {

    private final String data;

    public RealClient() {
        System.out.println("Real client initialized");
        data = "Test";
    }

    @Override
    public String GetData() {
        return data;
    }
}