package org.play.postprocessor.propertyeditor;

import org.play.publicinterface.ValidateInterface;

public class AA implements ValidateInterface {
    private String definition;

    public AA(String definition){
        this.definition = definition;
    }

    public AA(){}

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getDefinition() {
        return definition;
    }

    @Override
    public void doSomething() {
        System.out.println("Trans success, the definition is : " + definition);
    }
}
