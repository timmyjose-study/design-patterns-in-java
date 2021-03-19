package com.z0ltan.designpatterns.behavioural.command;

import java.util.List;
import java.util.ArrayList;

public class Broker {
  private List<Order> orders;
  
  public Broker() {
    this.orders = new ArrayList<>();
  }

  public void takeOrder(final Order order) {
    this.orders.add(order);
  }

  public void executeOrders() {
    for (final Order order : this.orders) {
      order.execute();
    }
  }
}
