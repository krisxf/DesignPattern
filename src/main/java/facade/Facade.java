package facade;

/**
 * @Program: DesignPattern
 * @Description: 外观类
 * @Author: kris
 * @Create: 2023-08-04 13:01
 **/

public class Facade {
    private Cpu cpu;
    private Ssd ssd;
    private Ddr ddr;

    public Facade() {
        this.cpu = new Cpu();
        this.ssd = new Ssd();
        this.ddr = new Ddr();
    }

    public void start(){
        cpu.start();
        ssd.start();
        ddr.start();
    }

}
