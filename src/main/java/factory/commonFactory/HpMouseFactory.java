package factory.commonFactory;

/**
 * @Program: DesignPattern
 * @Description: Hp鼠标生产工厂
 * @Author: kris
 * @Create: 2023-07-27 15:19
 **/

public class HpMouseFactory extends MouseFactory{

    @Override
    public Mouse create() {
        return new HpMouse();
    }
}
