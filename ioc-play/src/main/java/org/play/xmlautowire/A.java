package org.play.xmlautowire;

import org.play.publicinterface.ValidateInterface;

public class A implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("Inject success -- A!");
    }
}
