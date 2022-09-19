package org.play.dynamicproxy;

import org.play.publicinterface.ValidateInterface;

public class A implements ValidateInterface {
    @Override
    public void doSomething() {
        ValidateInterface.super.doSomething();
    }
}
