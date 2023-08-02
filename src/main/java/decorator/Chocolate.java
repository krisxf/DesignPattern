package decorator;

/**
 * @Program: DesignPattern
 * @Description: 实现类
 * @Author: kris
 * @Create: 2023-08-02 16:06
 **/

public class Chocolate extends Decorator{
    Chocolate(Drink drink) {
        super(drink);
        setDes("Chocolate");
        setPrice(2.0f);
    }
}
