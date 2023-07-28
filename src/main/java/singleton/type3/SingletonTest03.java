package singleton.type3;

/**
 * @Program: DesignPattern
 * @Description: 懒汉式实现单例模式
 * @Author: kris
 * @Create: 2023-07-26 16:08
 **/

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class Singleton{
    private static Singleton INSTANCE = null;

    private Singleton(){

    }

    /**
     * synchronized 解决线程安全问题
     */
    public static synchronized Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

