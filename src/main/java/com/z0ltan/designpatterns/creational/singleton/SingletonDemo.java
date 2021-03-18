package com.z0ltan.designpatterns.creational.singleton;

public class SingletonDemo {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Singleton singleton = Singleton.getInstance();
      singleton.printId();
    }
  }
}
