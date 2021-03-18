package com.z0ltan.designpatterns.creational.prototype;

public abstract class Shape implements Cloneable {
  protected String name;
  protected int id;
  protected Color color;

  public Shape(final String name, final int id, final Color color) {
    this.name = name;
    this.id = id;
    this.color = color;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public void setColor(final Color color) {
    this.color = color;
  }

  public String getName() {
    return this.name;
  }

  public int getId() {
    return this.id;
  }

  public Color getColor() {
    return this.color;
  }

  public void printDetails() {
    System.out.printf("Name = %s, id = %d, color = %s\n", this.name, this.id, this.color);
  }

  public abstract Shape clone() throws CloneNotSupportedException;
}
