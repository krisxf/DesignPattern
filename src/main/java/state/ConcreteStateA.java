package state;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-22 12:52
 **/

public class ConcreteStateA implements State{
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
