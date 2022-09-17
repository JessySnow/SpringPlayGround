package org.play.xmlautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-play-xml-autowire.xml");
        C c = (C) context.getBean("c");
        c.doSomething();
    }
}
