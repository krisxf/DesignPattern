package decorator;

/**
 * @Program: DesignPattern
 * @Description: 实现类
 * @Author: kris
 * @Create: 2023-08-02 16:05
 **/

public class Clip  extends  Decorator{
    Clip(Drink drink) {
        super(drink);
        setDes("Clip");
        setPrice(1.0f);
    }
}
