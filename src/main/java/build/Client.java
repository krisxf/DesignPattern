package build;

/**
 * @Program: DesignPattern
 * @Description: 客户端
 * @Author: kris
 * @Create: 2023-07-29 15:19
 **/

public class Client {
    public static void main(String[] args) {
        //建造者
        Builder builder = new ConcreteBuilder();
        //监工
        Director director = new Director(builder);
        //创建
        director.construct();

        StringBuilder s = new StringBuilder();
    }
}
