package org.play.scanner.bean;

import org.play.publicinterface.ValidateInterface;
import org.springframework.stereotype.Component;

@Component
public class A implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("A");
    }
}
