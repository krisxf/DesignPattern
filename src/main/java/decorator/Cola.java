package decorator;

/**
 * @Program: DesignPattern
 * @Description: 实现类
 * @Author: kris
 * @Create: 2023-08-02 16:01
 **/

public class Cola extends Drink{

    Cola(){
        setDes("Cola");
        setPrice(3.0f);
    }

    @Override
    public float cost() {
        return getPrice();
    }

}
