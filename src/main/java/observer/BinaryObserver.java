package observer;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-18 11:31
 **/

public class BinaryObserver implements Observer{
    @Override
    public void update(int state) {
        System.out.println("BinaryObserver "+state);
    }
}
