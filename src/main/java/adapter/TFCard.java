package adapter;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-07-31 15:05
 **/

public interface TFCard {
    String readTF();
    int writeTF(String msg);
}
