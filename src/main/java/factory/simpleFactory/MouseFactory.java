package factory.simpleFactory;

/**
 * @Program: DesignPattern
 * @Description: 鼠标工厂------简单工厂模式
 * @Author: kris
 * @Create: 2023-07-27 15:11
 **/

public class MouseFactory {
    public Mouse create(int type){
        Mouse mouse = null;
        switch (type){
            case 0: mouse = new DellMouse(); break;
            case 1: mouse = new HpMouse();break;
            default:break;
        }
        return  mouse;
    }

}
