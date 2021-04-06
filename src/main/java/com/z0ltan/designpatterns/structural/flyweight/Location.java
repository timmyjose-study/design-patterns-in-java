package com.z0ltan.designpatterns.structural.flyweight;

import java.util.Random;

public class Location {
  private int x;
  private int y;

  public Location(final int x, final int y) {
    this.x = x;
    this.y = y;
  }

  public static Location getRandomLocation(final Random randomizer) {
    return new Location(randomizer.nextInt(100), randomizer.nextInt(100));
  }

  @Override
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }
}
