package com.z0ltan.designpatterns.behavioural.visitor;

public interface CarElement {
  void accept(final CarElementVisitor visitor);
}
