package org.play.beanprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof A){
            A a = (A)bean;
            if(a.getValue().isEmpty()) {
                a.setValue("This value is inject in BeanPostProcessor");
            }else{
                a.setValue("This value is update in BeanPostProcessor");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
