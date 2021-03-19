package com.z0ltan.designpatterns.behavioural.visitor;

public interface CarElementVisitor {
  void visit(final Car car);
  void visit(final Engine engine);
  void visit(final Wheel wheel);
  void visit(final Body body);
}
