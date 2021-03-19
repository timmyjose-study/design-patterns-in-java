package com.z0ltan.designpatterns.creational.abstractfactory;

public class RoundedShapeFactory extends ShapeFactory {
  public Shape getShape(final ShapeType type) {
    switch (type) {
      case SQUARE:
        return new RoundedSquare();

      case TRIANGLE:
        return new RoundedTriangle();
    }

    return null;
  }
}
