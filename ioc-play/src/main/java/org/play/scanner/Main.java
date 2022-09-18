package org.play.scanner;

import org.play.scanner.bean.A;
import org.play.scanner.bean2.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-play-scanner.xml");
        A a = (A) context.getBean("a");
        B b = (B) context.getBean("b");
        a.doSomething();
        b.doSomething();
    }
}
