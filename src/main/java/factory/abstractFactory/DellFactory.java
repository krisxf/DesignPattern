package factory.abstractFactory;

/**
 * @Program: DesignPattern
 * @Description: Dell鼠标生产工厂
 * @Author: kris
 * @Create: 2023-07-27 15:18
 **/

public class DellFactory extends PcFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
