package factory.abstractFactory;

/**
 * @Program: DesignPattern
 * @Description: 简单工厂模式
 * @Author: kris
 * @Create: 2023-07-27 15:14
 **/

public class Main {
    public static void main(String[] args) {
        PcFactory dellFactory = new DellFactory();
        PcFactory hpFactory = new HpFactory();

        Keybo keybo = dellFactory.createKeybo();
        Mouse mouse = dellFactory.createMouse();
        keybo.sayHi();
        mouse.sayHi();

        Keybo keybo1 = hpFactory.createKeybo();
        Mouse mouse1 = hpFactory.createMouse();
        keybo1.sayHi();
        mouse1.sayHi();
    }
}
