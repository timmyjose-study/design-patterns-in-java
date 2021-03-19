package com.z0ltan.designpatterns.creational.abstractfactory;

public abstract class ShapeFactory {
  public abstract Shape getShape(final ShapeType type);
}
