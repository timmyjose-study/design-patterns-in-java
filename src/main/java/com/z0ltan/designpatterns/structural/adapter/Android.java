package com.z0ltan.designpatterns.structural.adapter;

public class Android implements MicroUsbPhone {
  @Override
  public void recharge() {
    System.out.println("Recharging Android phone");
  }
}
