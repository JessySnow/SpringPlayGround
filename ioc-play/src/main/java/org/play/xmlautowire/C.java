package org.play.xmlautowire;

import org.play.publicinterface.ValidateInterface;

public class C implements ValidateInterface {
    private B b;

    public C(){}

    public C(B b){
        this.b = b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public void doSomething() {
        b.doSomething();
        System.out.println("Autowire success -- C!");
    }
}
