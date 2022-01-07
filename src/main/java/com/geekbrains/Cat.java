package com.geekbrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;
    private boolean full;

    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        this.isHungry = true;
        this.full = false;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Name: " + name + ", hungry: " + isHungry + ", full: " + full);
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite) == true) {
            System.out.println(name + " поел из тарелки");
            isHungry = false;
            full = true;
        } else {
            System.out.println(name +  " недостаточно еды");
            isHungry = true;
            full = false;

        }
    }
}
