package bridge;

/**
 * @Program: DesignPattern
 * @Description: 通过将咖啡的类型 和 咖啡操作的不同组合分别抽象聚合起来 实现两个抽象的部分可以自己独立的发展
 * @Description: 即当我想点smallCoffee时，只需要继承Coffee这个抽象类，我就同时获得了加糖和加奶这两种操作，解决了类爆炸问题
 * @Author: kris
 * @Create: 2023-08-01 16:21
 **/
public class Client {
    public static void main(String[] args) {
        Coffee coffee = new LargerCoffee(new MilkCoffee());
        coffee.orderCoffee();
    }
}
