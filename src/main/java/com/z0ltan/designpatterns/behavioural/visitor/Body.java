package com.z0ltan.designpatterns.behavioural.visitor;

public class Body implements CarElement {
  @Override
  public void accept(final CarElementVisitor visitor) {
    visitor.visit(this);
  }
}
