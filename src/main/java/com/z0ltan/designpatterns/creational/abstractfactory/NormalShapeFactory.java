package com.z0ltan.designpatterns.creational.abstractfactory;

public class NormalShapeFactory extends ShapeFactory {
  public Shape getShape(final ShapeType type) {
    switch (type) {
      case SQUARE:
        return new NormalSquare();

      case TRIANGLE:
        return new NormalTriangle();
    }

    return null;
  }
}
