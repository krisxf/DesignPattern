package bridge;

/**
 * @Program: DesignPattern
 * @Description: 抽象咖啡类
 * @Author: kris
 * @Create: 2023-08-01 16:16
 **/

public abstract class Coffee {
    CoffeeOperation coffeeOperation;

    Coffee(CoffeeOperation coffeeOperation){
        this.coffeeOperation = coffeeOperation;
    }

    public abstract void orderCoffee();
}
