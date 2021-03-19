package com.z0ltan.designpatterns.creational.builder;

public abstract class FoodItem {
  private String name;

  public FoodItem(final String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
