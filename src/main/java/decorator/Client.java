package decorator;

/**
 * @Program: DesignPattern
 * @Description: 对于饮料与零食的组合有很多，使用装饰者模式进行一层套一层可以实现不同的组合方式
 * @Description 当想拓展饮料或者零食的种类时，只需要继承对应的类，然后进行嵌套即可
 * @Author: kris
 * @Create: 2023-08-02 16:07
 **/

public class Client {
    public static void main(String[] args) {
        //我需要一杯Cola 加上 Clip 和 Chocolate
        Drink drink = new Cola();
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        drink = new Clip(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        drink = new Chocolate(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

//        Drink drink1 = new Chocolate(new Chocolate(new Clip(new Cola())));
    }
}
