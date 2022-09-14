package org.play.autowire;

import org.play.publicinterface.ValidateInterface;
import org.springframework.stereotype.Component;

@Component(value = "A")
public class A implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("AutoWire Inject Success!");
    }
}
