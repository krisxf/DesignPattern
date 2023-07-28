package factory.abstractFactory;

/**
 * @Program: DesignPattern
 * @Description: 鼠标工厂------工厂模式
 * @Author: kris
 * @Create: 2023-07-27 15:11
 **/

public abstract class PcFactory {
    /**
     * 不同的工厂继承这个工厂类，生产自己工厂的一系列产品
     * @return 返回产品对象
     */
    public abstract Mouse createMouse();

    public abstract Keybo createKeybo();

}
