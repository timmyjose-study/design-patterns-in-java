package com.z0ltan.designpatterns.structural.flyweight;

public class Circle {
  private int radius; // intrinsic property

  public Circle(final int radius) {
    this.radius = radius;
  }

  // extrinsic properties
  public void draw(Color colorContext, Location locationContext) {
    System.out.printf("Drawing a %s circle of radius %d at location %s\n", colorContext, this.radius, locationContext);
  }
}
