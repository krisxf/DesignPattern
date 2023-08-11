package proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Program: DesignPattern
 * @Description: cglib动态代理
 * @Author: kris
 * @Create: 2023-08-11 16:18
 **/

public class Client {
    public static void main(String[] args) {
        //创建Enhancer对象，类似jdk动态代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置目标类的字节码文件
        enhancer.setSuperclass(RealImage.class);
        //设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());
        //调用create方法正式创建代理对象
        RealImage o = (RealImage) enhancer.create();

        o.display();


    }
}
