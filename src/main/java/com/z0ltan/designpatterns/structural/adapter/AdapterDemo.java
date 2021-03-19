package com.z0ltan.designpatterns.structural.adapter;

public class AdapterDemo {
  public static void main(String[] args) {
    final Android android = new Android();
    android.recharge();

    final IPhone iphone = new IPhone();
    iphone.recharge();

    final LightningToMicroUsbAdapter l2musb = new LightningToMicroUsbAdapter(iphone);
    l2musb.recharge();

    final MicroUsbToLightningAdapter musb2l = new MicroUsbToLightningAdapter(android);
    musb2l.recharge();
  }
}
