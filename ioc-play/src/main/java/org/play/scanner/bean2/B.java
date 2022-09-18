package org.play.scanner.bean2;

import org.play.publicinterface.ValidateInterface;
import org.springframework.stereotype.Component;

@Component(value = "b")
public class B implements ValidateInterface {
    @Override
    public void doSomething() {
        System.out.println("B");
    }
}
