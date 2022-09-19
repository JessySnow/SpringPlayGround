package org.play.dynamicproxy;

import org.play.publicinterface.ValidateInterface;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ValidateInterface a = (ValidateInterface) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{ValidateInterface.class}, new ValidateProxyHandler(new A()));

        a.doSomething();
    }
}
