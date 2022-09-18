package org.play.beanprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-play-bean-processor.xml");
        A a = (A) context.getBean("a");
        a.doSomething();
    }
}
