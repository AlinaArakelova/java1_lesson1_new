package com.geekbrains;

public class MainClass {
    public static void main(String[] args) {
        Workers[] workers = new Workers[5];
        workers[0] = new Workers("Алина Аракелова", "менеджер", "alina@mail.ru", "89885353575", "30000", 30);
        workers[1] = new Workers("Денис", "Программист", "denis@gmail.com", "898822288844", "50000", 41);
        workers[2] = new Workers("Тимур", "Оператор", "tima@ya.ru", "89285456791", "40000", 45);
        workers[3] = new Workers("Даниял", "Директор", "boss@gmail.com", "89990006611", "1000000", 18);
        workers[4] = new Workers("Френки", "собака", "lapiihvost@dog.com", "00000000", "0", 2);

        for (Workers worker : workers) {
            if (worker.age > 40) {
                System.out.println(worker);
            }

        }


    }

}

