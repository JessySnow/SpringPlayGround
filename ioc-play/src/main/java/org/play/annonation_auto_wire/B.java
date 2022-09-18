package org.play.annonation_auto_wire;

import org.play.publicinterface.ValidateInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class B implements ValidateInterface {
    private A a;

    public B(){}

    @Autowired
    public void setA(A a) {
        this.a = a;
    }

    @Override
    public void doSomething() {
        a.doSomething();
    }
}
