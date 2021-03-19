package com.z0ltan.designpatterns.behavioural.command;

public class Stock {
  private String name;
  private int quantity;

  public Stock(final String name, final int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public void sell(int quantity) {
    if (quantity <= this.quantity) {
      System.out.printf("Sold %d stocks of %s\n", quantity, this.name);
      this.quantity -= quantity;
    } else {
      throw new RuntimeException(String.format("insuffient stocks of %s", this.name));
    }
  }

  public void buy(int quantity) {
    System.out.printf("Bought %d stocks of %s\n", quantity, this.name);
    this.quantity += quantity;
  }
}
