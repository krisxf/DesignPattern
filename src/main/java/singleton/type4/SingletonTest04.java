package singleton.type4;

/**
 * @Program: DesignPattern
 * @Description: 双重检查实现单例模式
 * @Author: kris
 * @Create: 2023-07-26 16:08
 **/

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class Singleton{
    /**
     * 加入volatile关键字防止指令重排序
     * instance = new Singleton(); 并不是一个原子操作， 这句代码实际执行了三件事。
     *
     * 1、 给 Singleton 的实例分配内存；
     *
     * 2、调用 Singleton 的构造函数，初始化成员变量；
     *
     * 3、将 instance 的对象指向分配的内存空间。
     *
     * 因为 Java 编译器允许处理器乱序执行，2、3的顺序是无法保证的。如果是 1-3-2 执行的顺序，
     * 当执行完 3 、2未执行之前，被切换到 B 线程，此时 instance 已经非空，B 会直接取走 instance，在使用时就会出错。
     */
    private volatile static Singleton INSTANCE = null;

    private Singleton(){

    }

    /**
     * 双重检查，解决线程安全问题，解决懒加载问题
     */
    public static Singleton getInstance(){
        if (INSTANCE == null){
            synchronized (Singleton.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}

