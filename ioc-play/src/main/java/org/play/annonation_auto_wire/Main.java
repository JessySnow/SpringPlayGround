package org.play.annonation_auto_wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annonation-auto.xml");
        A a = (A) context.getBean("a");
        B b = (B) context.getBean("b");
        b.doSomething();
    }
}
