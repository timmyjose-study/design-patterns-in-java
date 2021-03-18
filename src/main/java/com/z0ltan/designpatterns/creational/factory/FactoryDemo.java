package com.z0ltan.designpatterns.creational.factory;

public class FactoryDemo {
  public static void main(String[] args) {
    final Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
    circle.draw();

    final Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
    square.draw();

    final Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
    triangle.draw();
  }
}
