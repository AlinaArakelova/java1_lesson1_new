package com.geekbrains;

import javax.naming.Name;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (amount > food) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    public void increaseFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.printf("Plate [ Food: %d ]\n", food);
    }
}
//1. Расширить задачу про котов и тарелки с едой.
//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного
// количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
// Если коту удалось покушать (хватило еды), сытость = true.
//4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
// то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой
// тарелки и потом вывести информацию о сытости котов в консоль.
//6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
