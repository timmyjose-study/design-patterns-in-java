package com.z0ltan.designpatterns.structural.adapter;

public class MicroUsbToLightningAdapter implements LightningPhone {
  private MicroUsbPhone musbPhone;

  public MicroUsbToLightningAdapter(final MicroUsbPhone musbPhone) {
    this.musbPhone = musbPhone;
  }

  @Override
  public void recharge() {
    System.out.println("[MicroUsbAToLightningAdapter] Charging using lightning");
    this.musbPhone.recharge();
  }
}
