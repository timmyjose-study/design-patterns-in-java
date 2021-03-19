package com.z0ltan.designpatterns.behavioural.command;

public class BuyStock implements Order {
  private Stock stock;
  private int quantity;

  public BuyStock(final Stock stock, final int quantity) {
    this.stock = stock;
    this.quantity = quantity;
  }

  @Override
  public void execute() {
    this.stock.buy(this.quantity);
  }
}
