package state;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-22 12:53
 **/

public class Client {
    public static void main(String[] args) {
        Context context = new Context(); //创建环境
        context.Handle(); //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
        }
}
