package com.z0ltan.designpatterns.behavioural.visitor;

public class VisitorDemo {
  public static void main(String[] args) {
    final Car car = new Car();
    car.accept(new CarElementCleanVisitor());
    car.accept(new CarElementReplaceVisitor());
  }
}
