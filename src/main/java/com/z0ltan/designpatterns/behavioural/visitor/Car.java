package com.z0ltan.designpatterns.behavioural.visitor;

public class Car implements CarElement {
  private final CarElement[] elements;

  public Car() {
    this.elements = new CarElement[] {
      new Engine(),
      new Wheel("front left"),
      new Wheel("front right"),
      new Wheel("rear left"),
      new Wheel("rear right"),
      new Engine(),
      new Body()
    };
  }

  @Override
  public void accept(final CarElementVisitor visitor) {
    for (final CarElement element : elements) {
      element.accept(visitor);
    }

    visitor.visit(this);
  }
}
