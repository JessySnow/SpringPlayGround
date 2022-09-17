package org.play.lazyinit;

import org.play.publicinterface.ValidateInterface;

public class B implements ValidateInterface {
    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public B(A a){
        this.a = a;
    }

    public B(){}

    @Override
    public void doSomething() {
        a.doSomething();
        System.out.println("B!");
    }
}
