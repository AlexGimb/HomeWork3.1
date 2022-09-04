import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void task2() {
        System.out.println();
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void task3() {
        int year = 2020;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год является не високосным");
        } else
            System.out.println(year + " год является не високосным");
    }

    public static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка займет: 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.printf("Доставка займет: 2 дня");
        } else {
            System.out.println("Доставка займет: 3 дня");
        }
    }

    public static void task5() {
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 3:
                System.out.println("Весна");
                break;
            case 7:
            case 8:
            case 6:
                System.out.println("Лето");
                break;
            case 10:
            case 11:
            case 9:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}

