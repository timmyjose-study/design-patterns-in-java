package com.z0ltan.designpatterns.behavioural.observer;

public class ObserverDemo {
  public static void main(String[] args) {
    final Observable observable = new Observable();
    observable.addObserver(event -> {
      System.out.println("You typed in: " + event);
    });

    observable.scanInput();
  }
}
