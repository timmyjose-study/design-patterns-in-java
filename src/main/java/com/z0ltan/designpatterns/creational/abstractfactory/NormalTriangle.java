package com.z0ltan.designpatterns.creational.abstractfactory;

public class NormalTriangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drew a normal triangle");
  }
}
