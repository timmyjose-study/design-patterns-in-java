package com.z0ltan.designpatterns.behavioural.visitor;

public class Engine implements CarElement {
  @Override
  public void accept(final CarElementVisitor visitor) {
    visitor.visit(this);
  }
}
