package proxy.staticProxy;

/**
 * @Program: DesignPattern
 * @Description: 真实角色
 * @Author: kris
 * @Create: 2023-08-11 16:02
 **/

public class RealImage implements Image{
    @Override
    public void display() {
        System.out.println("display");
    }
}
