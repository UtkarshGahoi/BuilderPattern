package org.example;

import java.util.ArrayList;
import java.util.List;

public class SandwichBuilder {
    private String bread;
    private String meat;
    private String cheese;
    private List<String> vegetables;
    private List<String> condiments;

    public SandwichBuilder() {
        this.vegetables = new ArrayList<>();
        this.condiments = new ArrayList<>();
    }
    public SandwichBuilder withBread(String bread) {
        this.bread = bread;
        return this;
    }
    public SandwichBuilder withMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public SandwichBuilder withCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public SandwichBuilder addVegetable(String vegetable) {
        this.vegetables.add(vegetable);
        return this;
    }

    public SandwichBuilder addCondiment(String condiment) {
        this.condiments.add(condiment);
        return this;
    }

    public Sandwich build() {
        return new Sandwich(bread, meat, cheese, vegetables, condiments);
    }


}
