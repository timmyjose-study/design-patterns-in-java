package com.z0ltan.designpatterns.creational.prototype;

public class Circle extends Shape {
  public Circle(final String name, final int id, final Color color) {
    super(name, id, color);
  }

  @Override
  public Circle clone() throws CloneNotSupportedException {
    Circle clonedCircle = new Circle(new String(this.name), this.id, this.color.clone());
    return clonedCircle;
  }
}
