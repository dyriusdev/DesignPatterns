package structural.proxy_pattern;

public class ProxyClient implements IClient {

    private final RealClient client = new RealClient();

    public ProxyClient() {
        System.out.println("Proxy client initialized");
    }

    @Override
    public String GetData() {
        return client.GetData();
    }
}