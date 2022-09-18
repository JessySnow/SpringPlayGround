package org.play.annonation_auto_wire;

import org.play.publicinterface.ValidateInterface;

public class A implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("A is autowired by spring");
    }
}
