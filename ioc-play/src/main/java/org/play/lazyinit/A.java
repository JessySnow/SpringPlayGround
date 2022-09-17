package org.play.lazyinit;

import org.play.publicinterface.ValidateInterface;

public class A implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("A!");
    }
}
