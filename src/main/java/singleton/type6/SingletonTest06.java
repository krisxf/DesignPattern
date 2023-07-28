package singleton.type6;

import java.security.PublicKey;

/**
 * @Program: DesignPattern
 * @Description: 使用枚举实现单例模式
 * @Author: kris
 * @Create: 2023-07-26 16:43
 **/

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

enum Singleton{
    //属性
    INSTANCE;
    public void say(){
        System.out.println("ok");
    }
}

