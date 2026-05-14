package spring_proxy;

public class Main {
    public static void main(String[] args) {
        ProxyUserService proxyUserService = new ProxyUserService();
        proxyUserService.saveUser();
    }
}
