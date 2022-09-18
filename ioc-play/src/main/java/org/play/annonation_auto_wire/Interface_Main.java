package org.play.annonation_auto_wire;

import org.play.publicinterface.ValidateInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Interface_Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-play-annonation-auto-modify.xml");
        C c = (C) context.getBean("c");
        c.doSomething();
    }
}
