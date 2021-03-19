package com.z0ltan.designpatterns.behavioural.command;

public class CommandDemo {
  public static void main(String[] args) {
    final Stock stock1 = new Stock("Ferrethandjobs", 100);
    final Stock stock2 = new Stock("wallaceandgromit", 50);

    final BuyStock buy1 = new BuyStock(stock1, 10);
    final BuyStock buy2 = new BuyStock(stock2, 20);
    final BuyStock buy3 = new BuyStock(stock1, 5);
    final SellStock sell1 = new SellStock(stock2, 1);
    final SellStock sell2 = new SellStock(stock1, 2);
    final SellStock sell3 = new SellStock(stock2, 3);
    final SellStock sell4 = new SellStock(stock1, 5);

    final Broker broker = new Broker();
    broker.takeOrder(buy1);
    broker.takeOrder(buy2);
    broker.takeOrder(sell1);
    broker.takeOrder(buy3);
    broker.takeOrder(sell2);
    broker.takeOrder(sell3);
    broker.takeOrder(sell4);
    broker.executeOrders();
  }
}