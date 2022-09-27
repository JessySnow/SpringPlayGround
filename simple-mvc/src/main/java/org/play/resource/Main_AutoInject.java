package org.play.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_AutoInject {
    public static void main(String[] args) {
        // 校验 Aware 接口的 Context 的自动注入
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource-aware-config.xml");
        ResourceLoaderAwareBean target = applicationContext.getBean(ResourceLoaderAwareBean.class);
        System.out.println(target.getApplicationContext() != null);
    }
}
