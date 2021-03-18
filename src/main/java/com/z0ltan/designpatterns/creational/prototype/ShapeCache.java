package com.z0ltan.designpatterns.creational.prototype;

import java.util.Map;
import java.util.HashMap;

public class ShapeCache {
  private static Map<Integer, Shape> cache = new HashMap<>();

  public static Shape getShape(final ShapeType type) {
    try {
      switch (type) {
        case CIRCLE:
          return ShapeCache.cache.get(0).clone();

        case SQUARE:
          return ShapeCache.cache.get(1).clone();
      }
    } catch (CloneNotSupportedException ex) {
      System.err.println("Error while attempting to clone: " + ex.getLocalizedMessage());
    }

    return null;
  }

  static {
    cache.put(0, new Circle("Circle0", 0, new Color("Black")));
    cache.put(1, new Square("Square0", 0, new Color("Black")));
  }
}
