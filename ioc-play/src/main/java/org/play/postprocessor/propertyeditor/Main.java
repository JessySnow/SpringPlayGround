package org.play.postprocessor.propertyeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// TODO FIX
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-play-propertyeditor.xml");
        BB bb = (BB) context.getBean("bb");
        bb.doSomething();
    }
}
