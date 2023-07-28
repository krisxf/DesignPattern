package factory.abstractFactory;

/**
 * @Program: DesignPattern
 * @Description: Hp鼠标生产工厂
 * @Author: kris
 * @Create: 2023-07-27 15:19
 **/

public class HpFactory extends PcFactory {

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
