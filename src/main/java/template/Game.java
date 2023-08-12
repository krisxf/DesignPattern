package template;

/**
 * @Program: DesignPattern
 * @Description: 抽象类，定义算法流程，具体实现由子类负责
 * @Author: kris
 * @Create: 2023-08-12 14:49
 **/

public abstract class Game {
    abstract void init();
    abstract void start();
    abstract void end();

    public final void play(){
        //初始化
        init();
        //开始
        start();
        //结束
        end();
    }
}
