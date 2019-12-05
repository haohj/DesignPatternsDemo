package com.hao.abstractFactory;

import com.hao.factory.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String colorType);
}
