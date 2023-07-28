package factory.simpleFactory;

/**
 * @Program: DesignPattern
 * @Description: 简单工厂模式
 * @Author: kris
 * @Create: 2023-07-27 15:14
 **/

public class Main {
    public static void main(String[] args) {
        MouseFactory mouseFactory = new MouseFactory();
        Mouse mouse = mouseFactory.create(0);
        Mouse mouse1 = mouseFactory.create(1);
        mouse.sayHi();
        mouse1.sayHi();
    }
}
