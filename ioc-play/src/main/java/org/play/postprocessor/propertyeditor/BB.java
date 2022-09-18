package org.play.postprocessor.propertyeditor;

import org.play.publicinterface.ValidateInterface;

public class BB implements ValidateInterface {
    private AA aa;

    public void setAa(AA aa) {
        this.aa = aa;
    }

    public AA getAa() {
        return aa;
    }

    @Override
    public void doSomething() {
        aa.doSomething();
    }
}
