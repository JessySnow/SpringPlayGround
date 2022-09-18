package org.play.beanprocessor;

import org.play.publicinterface.ValidateInterface;
import org.springframework.beans.factory.InitializingBean;

public class A implements ValidateInterface, InitializingBean {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public A(String value){
        this.value = value;
    }

    private void saySomething(){
        System.out.println("Hello World -- init-method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello World -- InitializingBean");
    }

    @Override
    public void doSomething() {
        System.out.println(value);
    }

}
