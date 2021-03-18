package com.z0ltan.designpatterns.creational.prototype;

public class Color {
  private String colorValue;

  public Color(final String colorValue) {
    this.colorValue = colorValue;
  }

  @Override
  public String toString() {
    return this.colorValue;
  }

  @Override
  public Color clone() throws CloneNotSupportedException {
    Color clonedColor = new Color(new String(this.colorValue));
    return clonedColor;
  }
}
