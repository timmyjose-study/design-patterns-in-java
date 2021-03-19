package com.z0ltan.designpatterns.creational.abstractfactory;

public class ShapeFactoryFactory {
  public static ShapeFactory getFactory(final ShapeFactoryType type) {
    switch(type) {
      case NORMAL:
        return new NormalShapeFactory();

      case ROUNDED:
        return new RoundedShapeFactory();
    }

    return null;
  }
}
