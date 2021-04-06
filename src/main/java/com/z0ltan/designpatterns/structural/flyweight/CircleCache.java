package com.z0ltan.designpatterns.structural.flyweight;

import java.util.Map;
import java.util.HashMap;

public class CircleCache {
  private static final Map<Integer, Circle> CACHE;

  static {
    CACHE = new HashMap<>();
  }

  public static Circle get(final int radius) {
    if (CircleCache.CACHE.containsKey(radius)) {
      return CircleCache.CACHE.get(radius);
    }

    final Circle circle = new Circle(radius);
    CircleCache.CACHE.put(radius, circle);

    return circle;
  }

  public static int uniqueCount() {
    return CircleCache.CACHE.size();
  }
}
