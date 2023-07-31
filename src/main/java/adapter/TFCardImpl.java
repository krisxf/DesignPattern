package adapter;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-07-31 15:05
 **/

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg ="tf card reade msg : hello word tf card";
        return msg;
    }
    @Override
    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}
