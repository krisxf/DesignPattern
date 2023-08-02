package decorator;

/**
 * @Program: DesignPattern
 * @Description: 实现类
 * @Author: kris
 * @Create: 2023-08-02 15:58
 **/

public class Coffee extends Drink{

    Coffee(){
        setDes("coffee");
        setPrice(10.0f);
    }


    @Override
    public float cost() {
        return getPrice();
    }
}
