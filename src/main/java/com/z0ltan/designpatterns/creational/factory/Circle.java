package com.z0ltan.designpatterns.creational.factory;

public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drew a circle");
  }
}
