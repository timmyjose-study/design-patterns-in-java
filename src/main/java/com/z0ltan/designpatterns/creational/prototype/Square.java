package com.z0ltan.designpatterns.creational.prototype;

public class Square extends Shape {
  public Square(final String name, final int id, final Color color) {
    super(name, id, color);
  }

  @Override
  public Square clone() throws CloneNotSupportedException {
    Square clonedSquare = new Square(new String(this.name), this.id, this.color.clone());
    return clonedSquare;
  }
}
