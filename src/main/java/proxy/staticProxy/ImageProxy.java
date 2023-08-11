package proxy.staticProxy;

/**
 * @Program: DesignPattern
 * @Description: 代理类
 * @Author: kris
 * @Create: 2023-08-11 16:03
 **/

public class ImageProxy implements Image{

    private final RealImage realImage;

    public ImageProxy(RealImage realImage) {
        this.realImage = realImage;
    }

    @Override
    public void display() {
        System.out.println("前置要求。。。");
        realImage.display();
    }
}
