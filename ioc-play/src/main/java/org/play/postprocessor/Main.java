package org.play.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-play-processor.xml");
        A a = (A) context.getBean("a");
        a.doSomething();
    }
}
