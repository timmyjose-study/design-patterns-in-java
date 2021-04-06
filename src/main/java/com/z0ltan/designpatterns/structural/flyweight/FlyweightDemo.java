package com.z0ltan.designpatterns.structural.flyweight;

import java.util.Random;

public class FlyweightDemo {
  public static void main(String[] args) {
    final Random random = new Random();

    for (int i = 0; i < 100; i++) {
      final Circle circle = CircleCache.get(random.nextInt(9) + 1);
      circle.draw(Color.getRandomColor(random), Location.getRandomLocation(random));
    }

    System.out.printf("Number of unique objects created = %d\n", CircleCache.uniqueCount());
  }
}