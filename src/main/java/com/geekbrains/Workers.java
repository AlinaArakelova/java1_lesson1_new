package com.geekbrains;

public class Workers {
        public String name;
        public String position;
        public String email;
        public String phone;
        public int age;
        public String salary;

    @Override
    public String toString() {
        return name + " " +  position + " " + email + " " + phone + " " + salary + " " + age;
    }

    public Workers(String name, String position, String email, String phone, String salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;

        }
    }


//    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//    Конструктор класса должен заполнять эти поля при создании объекта.
//    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//    Создать массив из 5 сотрудников.
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.


