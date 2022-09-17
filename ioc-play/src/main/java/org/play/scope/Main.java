package org.play.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-play-scope.xml");
        A a1 = (A) context.getBean("a_singleton_bean");
        A a2 = (A) context.getBean("a_singleton_bean");

        B b1 = (B) context.getBean("b_prototype_bean");
        B b2 = (B) context.getBean("b_prototype_bean");

        System.out.println(a1 == a2);
        System.out.println(b1 == b2);
    }
}
