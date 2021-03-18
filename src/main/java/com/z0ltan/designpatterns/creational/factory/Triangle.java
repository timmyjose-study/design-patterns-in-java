package com.z0ltan.designpatterns.creational.factory;

public class Triangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drew a triangle");
  }
}
