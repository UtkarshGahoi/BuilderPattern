package org.example;

import java.util.List;

public class Sandwich {
    private String bread;
    private String meat;
    private String cheese;
    private List<String> vegetables;
    private List<String> condiments;

    public Sandwich(String bread, String meat, String cheese, List<String> vegetables, List<String> condiments) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.condiments = condiments;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<String> vegetables) {
        this.vegetables = vegetables;
    }

    public List<String> getCondiments() {
        return condiments;
    }

    public void setCondiments(List<String> condiments) {
        this.condiments = condiments;
    }
}
