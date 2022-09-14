package org.play.manual;

import org.play.publicinterface.ValidateInterface;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Main {

    static class A implements ValidateInterface {
        @Override
        public void doSomething() {
            System.out.println("Inject Success");
        }
    }

    static class B implements ValidateInterface{
        private A a;
        public B(A a){
            this.a = a;
        }

        @Override
        public void doSomething() {
            a.doSomething();
        }
    }

    public static void main(String[] args) {
        // BeanFactory 的一个实现
        DefaultListableBeanFactory beanRegister = new DefaultListableBeanFactory();
        BeanFactory container = (BeanFactory) bindViaCode(beanRegister);

        // 从 Ioc 容器中获取 Bean
        B b = (B) container.getBean("B");
        b.doSomething();

        // 从 XML 构造 Bean 容器
        // BeanFactory 的一个实现
        DefaultListableBeanFactory beanRegister_xml = new DefaultListableBeanFactory();
        //
        BeanFactory container_xml = (BeanFactory) bindViaXml(beanRegister_xml);
        B b_xml = (B)container_xml.getBean("b");
        b_xml.doSomething();
    }

    public static BeanFactory bindViaCode(BeanDefinitionRegistry registry){
        // 构建 A类 和 B类 的类型定义对象
        AbstractBeanDefinition ADef = new RootBeanDefinition(A.class);
        AbstractBeanDefinition BDef = new RootBeanDefinition(B.class);

        // 注册 Bean 的定义到注册器中，第一个参数是该类型在容器中的 Code，相当于是主键的概念
        registry.registerBeanDefinition("A",ADef);
        registry.registerBeanDefinition("B",BDef);

        // 指定 Bean 之间的依赖关系
        // 这里使用 构造函数 来指定 A 和 B 之间的依赖关系
        // 具体是将 B类的定义对象 的构造器的参数列表的 第一个参数 设置为 A类的定义对象，因为 B类 的构造函数的第一个参数就是 A类
        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
        argumentValues.addIndexedArgumentValue(0, ADef);
        BDef.setConstructorArgumentValues(argumentValues);

        return (BeanFactory) registry;
    }

    public static BeanFactory bindViaXml(BeanDefinitionRegistry registry){
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("ioc-play.xml");
        return (BeanFactory) registry;
    }
}
