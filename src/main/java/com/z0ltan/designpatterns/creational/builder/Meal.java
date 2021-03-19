package com.z0ltan.designpatterns.creational.builder;

import java.util.List;
import java.util.ArrayList;

public class Meal {
  private List<FoodItem> items;

  public Meal() {
    this.items = new ArrayList<>();
  }

  public void addItem(final FoodItem item) {
    this.items.add(item);
  }

  public void serve() {
    System.out.println("Serving...");
    for (final FoodItem item : this.items) {
      System.out.printf("\t - %s\n", item);
    }
  }
}
