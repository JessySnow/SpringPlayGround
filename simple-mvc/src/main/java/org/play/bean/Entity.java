package org.play.bean;

public class Entity {
    private String Field;
    public Entity(String Field){
        this.Field = Field;
    }

    public void setField(String field) {
        Field = field;
    }

    public String getField() {
        return Field;
    }
}
