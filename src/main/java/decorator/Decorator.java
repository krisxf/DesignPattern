package decorator;

/**
 * @Program: DesignPattern
 * @Description: 装饰者
 * @Author: kris
 * @Create: 2023-08-02 16:02
 **/

public class Decorator extends Drink{
    Drink drink;

    Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        return getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return des + " " + getPrice() +" "+ drink.getDes() ;
    }
}
