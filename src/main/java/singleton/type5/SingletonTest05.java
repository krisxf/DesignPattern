package singleton.type5;

/**
 * @Program: DesignPattern
 * @Description: 静态内部类实现单例模式
 * @Author: kris
 * @Create: 2023-07-26 16:08
 **/

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class Singleton{

    private  static Singleton INSTANCE = null;

    private Singleton(){

    }

    /**
     * 静态内部类
     */
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

