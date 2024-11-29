public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" Задача 1");
        int clientOS = 3;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Пора обновить телефон ");
        }


        System.out.println(" Задача 2");
        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Телефон сломался");
        }


        System.out.println("Задача 3");
        int year = 2021;
        if (year % 400 == 0 && year > 1584) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0 && year > 1584) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year > 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным или ещё не введён");
        }

        System.out.println("Задача 4");

        int deliveryDistance = 85;
        if (deliveryDistance <= 20) {
            System.out.println(" потребуется " + 1 + " день ");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(" потребуется " + 2 + " дня ");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(" потребуется " + 3 + " дня ");
        } else {
            System.out.println(" доставка не выполняется ");
        }

        System.out.println("задача 5");

        int monthNumber = 1;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяц введен некоректно, введите другой месяц");


        }


    }


}
