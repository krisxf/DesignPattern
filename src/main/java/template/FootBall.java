package template;

/**
 * @Program: DesignPattern
 * @Description: 子类
 * @Author: kris
 * @Create: 2023-08-12 14:52
 **/

public class FootBall extends Game{
    @Override
    void init() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void start() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void end() {
        System.out.println("Football Game Finished!");
    }
}
