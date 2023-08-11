package proxy.staticProxy;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-11 16:04
 **/

public class Client {
    public static void main(String[] args) {
        RealImage realImage = new RealImage();
        ImageProxy proxy = new ImageProxy(realImage);
        proxy.display();
    }
}
