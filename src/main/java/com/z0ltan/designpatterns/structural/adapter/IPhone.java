package com.z0ltan.designpatterns.structural.adapter;

public class IPhone implements LightningPhone {
  @Override
  public void recharge() {
    System.out.println("Recharging Iphone");
  }
}
