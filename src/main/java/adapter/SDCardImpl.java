package adapter;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-07-31 15:03
 **/
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "sdcard read a msg :hello word SD";
        return msg;
    }
    @Override
    public int writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}