package com.z0ltan.designpatterns.behavioural.iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    final Range range = new Range(2, 11);

    final MyIterator<Integer> it = range.iterator();
    while (it.hasNext()) {
      System.out.printf("%d ", it.next());
    }
    System.out.println();
  }
}
