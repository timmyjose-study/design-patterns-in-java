package com.z0ltan.designpatterns.behavioural.visitor;

public class CarElementReplaceVisitor implements CarElementVisitor {
  @Override
  public void visit(final Car car) {
    System.out.println("Replaced car");
  }

  @Override
  public void visit(final Wheel wheel) {
    System.out.println("Replaced wheel: " + wheel.getName());
  }

  @Override
  public void visit(final Engine engine) {
    System.out.println("Replaced engine");
  } 

  @Override
  public void visit(final Body body) {
    System.out.println("Replaced body");
  }
}
