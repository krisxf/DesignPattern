package singleton.type1;

/**
 * @Program: DesignPattern
 * @Description: 饿汉式（静态常量）实现单例模式
 * @Author: kris
 * @Create: 2023-07-26 15:52
 **/

public class SingletonTest01 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class Singleton{
    private static final Singleton INSTANCE = new Singleton();

    /**
     *构造器私有化
     */
    private Singleton(){

    }

    /**
     * 向外提供一个获得对象的接口
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
