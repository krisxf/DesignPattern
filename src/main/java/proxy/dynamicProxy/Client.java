package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Program: DesignPattern
 * @Description: jdk动态代理
 * @Author: kris
 * @Create: 2023-08-11 16:08
 **/

public class Client {
    public static void main(String[] args) {
        Image realImage = new RealImage();
        InvocationHandler invocationHandler = new MyInvocationHandler(realImage);
        Image proxyInstance = (Image) Proxy.newProxyInstance(realImage.getClass().getClassLoader(),
                                                            new Class[]{Image.class},
                                                            invocationHandler);
        proxyInstance.display();
    }
}
