package facade;

/**
 * @Program: DesignPattern
 * @Description: 硬盘类
 * @Author: kris
 * @Create: 2023-08-04 13:00
 **/

public class Ssd implements Computer{
    @Override
    public void start() {
        System.out.println("SSD start");
    }
}
