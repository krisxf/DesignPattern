package bridge;

/**
 * @Program: DesignPattern
 * @Description: 加奶
 * @Author: kris
 * @Create: 2023-08-01 16:18
 **/

public class MilkCoffee implements CoffeeOperation{
    @Override
    public void add() {
        System.out.println("加奶");
    }
}
