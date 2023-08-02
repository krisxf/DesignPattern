package decorator;

/**
 * @Program: DesignPattern
 * @Description: 实现类
 * @Author: kris
 * @Create: 2023-08-02 16:00
 **/

public class Juice extends Drink{

    Juice(){
        setDes("Juice");
        setPrice(5.0f);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
