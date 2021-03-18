package com.z0ltan.designpatterns.creational.factory;

public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("Drew a square");
  }
}
