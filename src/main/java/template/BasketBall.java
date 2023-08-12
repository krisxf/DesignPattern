package template;

/**
 * @Program: DesignPattern
 * @Description: 子类
 * @Author: kris
 * @Create: 2023-08-12 14:53
 **/

public class BasketBall extends Game{
    @Override
    void init() {
        System.out.println("BasketBall Game Initialized! Start playing.");
    }

    @Override
    void start() {
        System.out.println("BasketBall Game Started. Enjoy the game!");
    }

    @Override
    void end() {
        System.out.println("BasketBall Game Finished!");
    }
}
