package com.z0ltan.designpatterns.creational.abstractfactory;

public class RoundedSquare implements Shape {
  @Override
  public void draw() {
    System.out.println("Drew a rounded square");
  }
}
