package org.play.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 实现了 Aware 接口，ApplicationContext 加载完成后会通过自动注入自己
 */
public class ResourceLoaderAwareBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    // 容器自动注入的接口方法
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Inject by Spring Framework");
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
