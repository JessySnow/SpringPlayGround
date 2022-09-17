package org.play.lazyinit;

import org.play.publicinterface.ValidateInterface;

public class C implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("C!");
    }
}
