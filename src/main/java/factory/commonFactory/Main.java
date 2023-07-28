package factory.commonFactory;

/**
 * @Program: DesignPattern
 * @Description: 简单工厂模式
 * @Author: kris
 * @Create: 2023-07-27 15:14
 **/

public class Main {
    public static void main(String[] args) {
        DellMouseFactory dellMouseFactory = new DellMouseFactory();
        Mouse dell = dellMouseFactory.create();
        dell.sayHi();
        HpMouseFactory hpMouseFactory = new HpMouseFactory();
        Mouse hp = hpMouseFactory.create();
        hp.sayHi();
    }
}
