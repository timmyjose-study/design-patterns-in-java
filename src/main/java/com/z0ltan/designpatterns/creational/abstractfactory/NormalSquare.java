package com.z0ltan.designpatterns.creational.abstractfactory;

public class NormalSquare implements Shape {
  @Override
  public void draw() {
    System.out.println("Drew a normal square");
  }
}
