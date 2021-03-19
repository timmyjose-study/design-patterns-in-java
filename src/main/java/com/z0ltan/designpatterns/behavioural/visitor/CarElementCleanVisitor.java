package com.z0ltan.designpatterns.behavioural.visitor;

public class CarElementCleanVisitor implements CarElementVisitor {
  @Override
  public void visit(final Car car) {
    System.out.println("Visited car");
  }

  @Override
  public void visit(final Wheel wheel) {
    System.out.println("Visited wheel: " + wheel.getName());
  }

  @Override
  public void visit(final Engine engine) {
    System.out.println("Visited engine");
  }

  @Override
  public void visit(final Body body) {
    System.out.println("Visited car");
  } 
}
