package com.z0ltan.designpatterns.structural.adapter;

public class LightningToMicroUsbAdapter implements MicroUsbPhone {
  private LightningPhone lphone;

  public LightningToMicroUsbAdapter(final LightningPhone lphone) {
    this.lphone = lphone;
  }

  @Override
  public void recharge() {
    System.out.println("[LightningToMicroUsbAdapter] Charging using micro usb adapter");
    this.lphone.recharge();
  }
}
