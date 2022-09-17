package org.play.xmlautowire;

import org.play.publicinterface.ValidateInterface;

public class B implements ValidateInterface {
    private A a;

    public B(A a){
        this.a = a;
    }

    @Override
    public void doSomething() {
        a.doSomething();
        System.out.println("Autowire success -- B!");
    }
}
