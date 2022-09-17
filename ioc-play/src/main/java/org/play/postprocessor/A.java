package org.play.postprocessor;

import org.play.publicinterface.ValidateInterface;

public class A implements ValidateInterface {
    private String value;

    public A(){}

    public A(String value){
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void doSomething() {
        System.out.println("Replace value success : " + value);
    }
}
