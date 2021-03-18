package com.z0ltan.designpatterns.creational.prototype;

public class PrototypeDemo {
  public static void main(String[] args) {
    final Shape circle1 = ShapeCache.getShape(ShapeType.CIRCLE);
    circle1.printDetails();

    final Shape circle2 = ShapeCache.getShape(ShapeType.CIRCLE);
    circle2.printDetails();

    circle2.setName("Blue Circle");
    circle2.setColor(new Color("Blue"));
    circle2.printDetails();
    circle1.printDetails();

    final Shape square1 = ShapeCache.getShape(ShapeType.SQUARE);
    square1.setName("Square1");
    square1.printDetails();

    final Shape square2 = ShapeCache.getShape(ShapeType.SQUARE);
    square2.printDetails();

    square2.setName("Red Square");
    square2.setId(199);
    square2.setColor(new Color("Red"));
    square2.printDetails();
    square1.printDetails();
  }
}
