package org.play.annonation_auto_wire;

import org.play.publicinterface.ValidateInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class C {
    public C(){}

    private ValidateInterface validateInterface;

    public C(ValidateInterface validateInterface){
        this.validateInterface = validateInterface;
    }

    // 在 XML 中定义时注入的是 interface_a，此时使用 @Autowire 进行了覆盖
    // 证明了 BeanPostProcessor 的实例化时机会晚于 BeanDefination 构造的时机
    @Autowired
    public void setValidateInterface(ValidateInterface interface_b) {
        this.validateInterface = interface_b;
    }

    public void doSomething(){
        validateInterface.doSomething();
    }
}
