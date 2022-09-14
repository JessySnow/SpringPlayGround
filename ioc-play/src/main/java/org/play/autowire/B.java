package org.play.autowire;

import org.play.publicinterface.ValidateInterface;
import org.springframework.stereotype.Component;

@Component(value = "B")
public class B implements ValidateInterface {
    private A a;

    @Override
    public void doSomething() {
        a.doSomething();
    }
}
