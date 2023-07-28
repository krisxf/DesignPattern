package factory.simpleFactory;

/**
 * @Program: DesignPattern
 * @Description: 鼠标产品
 * @Author: kris
 * @Create: 2023-07-27 15:10
 **/

public class HpMouse extends Mouse{
    @Override
    void sayHi() {
        System.out.println("HpMouse");
    }
}
