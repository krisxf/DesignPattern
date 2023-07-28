package factory.commonFactory;

/**
 * @Program: DesignPattern
 * @Description: 鼠标工厂------工厂模式
 * @Author: kris
 * @Create: 2023-07-27 15:11
 **/

public abstract class MouseFactory {
    /**
     * 不同的工厂继承这个工厂类，生产自己工厂的产品
     * @return 返回产品对象
     */
    public abstract Mouse create();

}
