package proxy.cglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Program: DesignPattern
 * @Description:
 * @Author: kris
 * @Create: 2023-08-11 16:16
 **/

public class MyMethodInterceptor implements MethodInterceptor {
    /**
     *
     * @param o 表示要增强的类
     * @param method 表示要拦截的方法
     * @param args 表示要被拦截的方法的参数
     * @param methodProxy 表示要触发父类的方法对象
     * @return 返回
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib动态代理");
        return methodProxy.invokeSuper(o, args);
    }
}
