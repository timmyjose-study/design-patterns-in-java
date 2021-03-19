package com.z0ltan.designpatterns.behavioural.observer;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Observable {
  private List<Observer> observers;

  public Observable() {
    this.observers = new ArrayList<>();
  }

  public void addObserver(final Observer observer) {
    this.observers.add(observer);
  }

  public void notifyObserver(final Observer observer, final String event) {
    if (!this.observers.contains(observer)) {
      throw new IllegalStateException("given observer is not part of this observable's observers list");
    }
    observer.update(event);
  }

  public void notifyAllObservers(final String event) {
    for (final Observer observer : this.observers) {
      observer.update(event);
    }
  }

  public void scanInput() {
    final Scanner in = new Scanner(System.in);

    while (in.hasNextLine()) {
      this.notifyAllObservers(in.nextLine());
    }

    in.close();
  }
}

