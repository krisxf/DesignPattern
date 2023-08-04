package facade;

/**
 * @Program: DesignPattern
 * @Description: CPU类
 * @Author: kris
 * @Create: 2023-08-04 12:59
 **/

public class Cpu implements Computer{
    @Override
    public void start() {
        System.out.println("CPU start");
    }
}
