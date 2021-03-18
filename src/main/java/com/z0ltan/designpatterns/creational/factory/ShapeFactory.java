package com.z0ltan.designpatterns.creational.factory;

public class ShapeFactory {
  public static Shape getShape(final ShapeType type) {
    switch (type) {
      case CIRCLE:
        return new Circle();

      case SQUARE:
        return new Square();

      case TRIANGLE:
        return new Triangle();
    }

    return null;
  }
}
