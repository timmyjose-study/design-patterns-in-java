package com.z0ltan.designpatterns.behavioural.command;

public class SellStock implements Order {
  private Stock stock;
  private int quantity;
  
  public SellStock(final Stock stock, final int quantity) {
    this.stock = stock;
    this.quantity = quantity;
  }

  @Override
  public void execute() {
    this.stock.sell(this.quantity);
  }
}
