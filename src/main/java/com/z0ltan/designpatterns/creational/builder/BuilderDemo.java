package com.z0ltan.designpatterns.creational.builder;

public class BuilderDemo {
  public static void main(String[] args) {
    final Meal nonVegMeal = 
      MealBuilder.newMeal()
      .withChicken()
      .withPepsi()
      .withItalianBread()
      .prepare();
    nonVegMeal.serve();

    final Meal vegMeal = 
      MealBuilder.newMeal()
      .withSalad()
      .withPepsi()
      .withRyeBread()
      .prepare();
    vegMeal.serve();

    final Meal jumboMeal = 
      MealBuilder.newMeal()
      .withBeef()
      .withChicken()
      .withSalad()
      .withItalianBread()
      .withPepsi()
      .withCoke()
      .withBeer()
      .prepare();
    jumboMeal.serve();
  }
}
