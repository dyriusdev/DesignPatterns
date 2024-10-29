package structural.proxy_pattern;

public class Test {

    public static void main(String[] args) {
        ProxyClient client = new ProxyClient();
        System.out.println("Data from client proxy : " + client.GetData());
    }
}