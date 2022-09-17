package org.play.depinject;

import org.play.publicinterface.ValidateInterface;

public class B implements ValidateInterface {
    private A a;

    public B(){}

    // 使用 setter 进行注入操作
    public void setA(A a) {
        this.a = a;
    }

    @Override
    public void doSomething() {
        a.doSomething();
    }
}
