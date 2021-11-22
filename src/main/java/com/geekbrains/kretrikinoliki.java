package com.geekbrains;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class kretrikinoliki {
    private static Scanner scanner;
    private static Random random;
    private static char[][] map;

    private static final int SIZE = 3;

    private static final char MAP_ELEMENT_EMPTY = '.';
    private static final char MAP_ELEMENT_X = 'X';
    private static final char MAP_ELEMENT_0 = '0';

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();
        initMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (checkWin(MAP_ELEMENT_X)) {
                System.out.println("Поздравляю тебя, человек!");
                break;
            }
            if (isMupFull()) {
                System.out.println("Игра окончена! Ничья!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(MAP_ELEMENT_0)) {
                System.out.println("Ты проиграл игру, но не сражение!");
                break;
            }
            if (isMupFull()) {
                System.out.println("Игра окончена! Ничья!");
                break;
            }
        }
    }

    public static boolean checkWin(char element) {
        for (int n = 0; n < SIZE; n++) {
            int elementsCount = 0;
            for (int i = 0; i < SIZE; i++) {
                if (map[n][i] == element) {
                    elementsCount = elementsCount + 1;
                }
            }
            if (elementsCount == SIZE) {
                return true;
            }
        }
        for (int n = 0; n < SIZE; n++) {
            int elementsCount = 0;
            for (int i = 0; i < SIZE; i++) {
                if (map[i][n] == element) {
                    elementsCount = elementsCount + 1;
                }
            }
            if (elementsCount == SIZE) {
                return true;
            }
        }
        int elementsCount = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == element) {
                elementsCount++;
            }
        }
        if (elementsCount == SIZE) {
            return true;
        }

        elementsCount = 0;
        for (int i = SIZE-1; i >= 0; i--) {
            if (map[i][SIZE - i - 1] == element) {
                elementsCount++;
            }
        }
        if (elementsCount == SIZE) {
            return true;
        }


    /*    for (int row = 0; row < SIZE; row++) {

            int elementsInRow = 0; //
            for (int col = 0; col < SIZE; col++) {
                if (map[col][row] == element) {
                    elementsInRow += 1;
                }
            }
            if (elementsInRow == SIZE) {
                return true;
            }
        }
        for (int col = 0; col < SIZE; col++) {


            int elementsInCol = 0; //
            for (int row = 0; row < SIZE; row++) {
                if (map[row][col] == element) {
                    elementsInCol += 1;
                }
            }
            if (elementsInCol == SIZE) {
                return true;
            }
        }

        */
        return false;
    }





        /*if (map[0][0] == element && map[1][0] == element && map[2][0] == element) {
            return true;
        }
        if (map[0][1] == element && map[1][1] == element && map[2][1] == element) {
            return true;
        }
        if (map[0][2] == element && map[1][2] == element && map[2][2] == element) {
            return true;
        }
        if (map[0][0] == element && map[0][1] == element && map[0][2] == element) {
            return true;
        }
        if (map[1][0] == element && map[1][1] == element && map[1][2] == element) {
            return true;
        }
        if (map[2][0] == element && map[2][1] == element && map[2][2] == element) {
            return true;
        }
        if (map[0][0] == element && map[1][1] == element && map[2][2] == element) {
            return true;
        }
        if (map[2][0] == element && map[1][1] == element && map[0][2] == element) {
            return true;
        }
        return false;*/


    public static boolean isMupFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == MAP_ELEMENT_EMPTY) {
                    return false;
                }

            }

        }
        return true;
    }

    public static void aiTurn() {
        int x, y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isMoveValid(x, y));

        map[x][y] = MAP_ELEMENT_0;
        System.out.println("AI сходил в клетку [ " + x + ", " + (y + 1) + " ]");
    }

    public static void playerTurn() {
        int x, y;

        do {
            System.out.println("Введите координаты вашего хода ('X Y')");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isMoveValid(x, y));

        map[x][y] = MAP_ELEMENT_X;
    }

    public static boolean isMoveValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[x][y] != MAP_ELEMENT_EMPTY) {
            return false;
        }
        return true;
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = MAP_ELEMENT_EMPTY;
            }
        }
    }
}
