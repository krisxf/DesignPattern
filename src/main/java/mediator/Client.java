package mediator;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-19 11:58
 **/

public class Client {
    public static void main(String[] args) {
        //用户之间并不直接联系，而通过中间平台进行消息的发送，常见的qq群，聊天室，短信平台等都有中介者的影子
        //这样每个用户并不需要直接依赖其他用户，只需要依赖中间的这个平台就行，从而降低的耦合性
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
