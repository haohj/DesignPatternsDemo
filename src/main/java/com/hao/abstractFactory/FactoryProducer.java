package com.hao.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if ("shape".equalsIgnoreCase(factoryType)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(factoryType)) {
            return new ColorFactory();
        }
        return null;
    }
}
