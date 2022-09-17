package org.play.depinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-play-depinj.xml");
        B b = (B) context.getBean("b");
        b.doSomething();
    }
}
