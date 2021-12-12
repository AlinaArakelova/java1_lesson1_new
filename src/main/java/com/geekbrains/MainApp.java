package com.geekbrains;

public class MainApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", 200, 0);

        Dog dog = new Dog("Бобик", 500, 10);

        cat.run(500);
        dog.run(500);

        cat.swim(10);
        dog.swim(10);

    }
}
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу
// передается длина препятствия. Результатом выполнения действия будет печать в консоль.
// (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.