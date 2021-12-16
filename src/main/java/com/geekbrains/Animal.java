package com.geekbrains;

public class Animal {

    public String name;
    public int maxDistanceRun;
    public int maxDistanceSwim;


    public void run(int run) {
        if (run > maxDistanceRun) {
            System.out.println(name + " не пробежал, превышена максимальная дистанция = " + maxDistanceRun + " m");
        } else {
            System.out.println(name + " пробежал " + run + " m");
        }
    }

    public void swim(int swim) {
        if (swim > maxDistanceSwim) {
            System.out.println(name + " не проплыл, превышена максимальная дистанция = " + maxDistanceSwim + " m");
        } else {
            System.out.println(name + " проплыл " + swim + " m");

        }

    }
}


