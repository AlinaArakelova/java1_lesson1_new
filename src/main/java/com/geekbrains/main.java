package com.geekbrains;

public class main {
    public static void main(String[] args) {
        checkSum(5, 7);
        isPositiveOrNegative(-10);
        isNegative(7);
        printWordNTimes(9, "alina");
    }

    public static boolean checkSum(int a, int b) {
        int i = a + b;
        return i >= 10 && i <= 20;
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        return a < 0;
    }

    public static void printWordNTimes(int n, String l) {
        for (int i = 0; i < n; i++) {
            System.out.println(l);
        }
    }
}

