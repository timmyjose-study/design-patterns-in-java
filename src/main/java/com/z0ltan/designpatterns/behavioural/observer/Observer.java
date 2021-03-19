package com.z0ltan.designpatterns.behavioural.observer;

@FunctionalInterface
public interface Observer {
  void update(String event);
}
