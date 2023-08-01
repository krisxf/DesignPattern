package bridge;

/**
 * @Program: DesignPattern
 * @Description: 加糖
 * @Author: kris
 * @Create: 2023-08-01 16:18
 **/

public class SugarCoffee implements CoffeeOperation{
    @Override
    public void add() {
        System.out.println("加糖");
    }
}
