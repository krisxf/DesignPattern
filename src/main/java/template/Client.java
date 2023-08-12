package template;

import java.util.Arrays;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-12 14:54
 **/

public class Client {
    public static void main(String[] args) {
        Game game = new BasketBall();
        game.play();
        game = new FootBall();
        game.play();
    }
}
