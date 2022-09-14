package org.play.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// TODO FIX NPE
public class Main {
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("ioc-play-autowire.xml");
        B b  = (B)context.getBean("B");
        b.doSomething();
    }
}
