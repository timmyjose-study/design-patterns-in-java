package com.z0ltan.designpatterns.creational.singleton;

public class Singleton {
  private static Singleton _instance = new Singleton();

  private Singleton() {}

  public static Singleton getInstance() {
    return _instance;
  }

  public void printId() {
    System.out.println("I am object " + this);
  }
}
