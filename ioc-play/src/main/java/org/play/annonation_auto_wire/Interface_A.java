package org.play.annonation_auto_wire;

import org.play.publicinterface.ValidateInterface;

public class Interface_A implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("This is Interface_A");
    }
}
