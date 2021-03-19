package com.z0ltan.designpatterns.creational.abstractfactory;

public class AbstractFactoryDemo {
  public static void main(String[] args) {
    final ShapeFactory normalFactory = ShapeFactoryFactory.getFactory(ShapeFactoryType.NORMAL);

    final Shape normalSquare = normalFactory.getShape(ShapeType.SQUARE);
    normalSquare.draw();
    
    final Shape normalTriangle = normalFactory.getShape(ShapeType.TRIANGLE);
    normalTriangle.draw();

    final ShapeFactory roundedFactory = ShapeFactoryFactory.getFactory(ShapeFactoryType.ROUNDED);

    final Shape roundedSquare = roundedFactory.getShape(ShapeType.SQUARE);
    roundedSquare.draw();

    final Shape roundedTriangle = roundedFactory.getShape(ShapeType.TRIANGLE);
    roundedTriangle.draw();
  }
}
