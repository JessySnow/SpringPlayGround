package org.play.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理，invoke 函数会包裹代理对象的执行逻辑
 */
public class ValidateProxyHandler implements InvocationHandler {
    private Object target;

    public ValidateProxyHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("doSomething")){
            System.out.println("This is invoke by a proxy object!");
            return method.invoke(target, args);
        }
        return method.invoke(target, args);
    }
}
