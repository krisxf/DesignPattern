package facade;

/**
 * @Program: DesignPattern
 * @Description: 内存类
 * @Author: kris
 * @Create: 2023-08-04 13:00
 **/

public class Ddr implements Computer{
    @Override
    public void start() {
        System.out.println("DDR start");
    }
}
