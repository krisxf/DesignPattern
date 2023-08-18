package observer;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-18 11:31
 **/

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new BinaryObserver());
        subject.addObserver(new OctalObserver());

        subject.setState(20);
    }
}
