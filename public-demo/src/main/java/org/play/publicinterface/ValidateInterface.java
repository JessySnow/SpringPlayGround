package org.play.publicinterface;

public interface ValidateInterface {
    public default void doSomething(){
        System.out.println("Hello World");
    }
}
