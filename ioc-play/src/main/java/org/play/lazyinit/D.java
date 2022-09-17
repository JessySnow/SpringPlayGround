package org.play.lazyinit;

import org.play.publicinterface.ValidateInterface;

public class D implements ValidateInterface {
    private C c;

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public void doSomething() {
        c.doSomething();
        System.out.println("D!");
    }
}
