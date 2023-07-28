package factory.commonFactory;

/**
 * @Program: DesignPattern
 * @Description: Dell鼠标生产工厂
 * @Author: kris
 * @Create: 2023-07-27 15:18
 **/

public class DellMouseFactory extends MouseFactory{
    @Override
    public Mouse create() {
        return new DellMouse();
    }
}
