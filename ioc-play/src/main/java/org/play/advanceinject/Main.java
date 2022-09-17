package org.play.advanceinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-play-advinj.xml");
        Container container = (Container) context.getBean("container");

        List<String> list = container.getList();
        Map<String, String> map = container.getMap();
        Properties properties = container.getProperties();

        list.forEach(System.out::println);
        map.forEach((key, value) -> System.out.println(value));
        // NPE 因为注入了 NULL
        properties.forEach((key, value) -> System.out.println(value));
    }
}
