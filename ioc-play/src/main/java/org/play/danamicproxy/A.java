package org.play.danamicproxy;

import org.play.publicinterface.ValidateInterface;

public class A implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("This is A");
    }
}
