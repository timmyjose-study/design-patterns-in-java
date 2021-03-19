package com.z0ltan.designpatterns.creational.builder;

public class MealBuilder {
  private Meal meal;

  private MealBuilder() {
    this.meal = new Meal();
  }

  public static MealBuilder newMeal() {
    return new MealBuilder();
  }

  public MealBuilder withChicken() {
    this.meal.addItem(new MeatItem("chicken"));
    return this;
  }

  public MealBuilder withBeef() {
    this.meal.addItem(new MeatItem("beef"));
    return this;
  }

  public MealBuilder withPepsi() {
    this.meal.addItem(new DrinkItem("pepsi"));
    return this;
  }

  public MealBuilder withCoke() {
    this.meal.addItem(new DrinkItem("coke"));
    return this;
  }

  public MealBuilder withSalad() {
    this.meal.addItem(new VegetableItem("salad"));
    return this;
  }

  public MealBuilder withItalianBread() {
    this.meal.addItem(new BreadItem("italian bread"));
    return this;
  }

  public MealBuilder withRyeBread() {
    this.meal.addItem(new BreadItem("rye bread"));
    return this;
  }

  public MealBuilder withBeer() {
    this.meal.addItem(new DrinkItem("beer"));
    return this;
  }

  public Meal prepare() {
    return this.meal;
  }
}
