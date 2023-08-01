package bridge;

/**
 * @Program: DesignPattern
 * @Description: 大杯咖啡
 * @Author: kris
 * @Create: 2023-08-01 16:20
 **/

public class LargerCoffee extends Coffee{
    LargerCoffee(CoffeeOperation coffeeOperation) {
        super(coffeeOperation);
    }

    @Override
    public void orderCoffee() {
        coffeeOperation.add();
        System.out.println("大杯咖啡");
    }
}
