package com.z0ltan.designpatterns.structural.flyweight;

import java.util.Random;

public enum Color {
  RED("red"),
  GREEN("green"),
  BLUE("blue"),
  YELLOW("yellow"),
  WHITE("white"),
  BLACK("black");

  private String color;

  private Color(final String color) {
    this.color = color;
  }

  public static Color getRandomColor(final Random randomizer) {
    return Color.values()[randomizer.nextInt(Color.values().length)];
  }

  @Override
  public String toString() {
    return this.color;
  }
}
