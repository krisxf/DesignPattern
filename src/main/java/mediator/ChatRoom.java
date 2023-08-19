package mediator;

/**
 * @Program: DesignPattern
 * @Description: 中介类
 * @Author: kris
 * @Create: 2023-08-19 11:56
 **/

public class ChatRoom {
    public static void showMessage(User user,String msg){
        System.out.println(user.getName() + "：" + msg);
    }
}
