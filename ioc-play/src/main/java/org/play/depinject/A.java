package org.play.depinject;

import org.play.publicinterface.ValidateInterface;

public class A implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("Depends inject success!");
    }
}
