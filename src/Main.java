public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Ты должен праздновать");
            if (age < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей что хочешь");
            }
    }
        int age2 = 6;
        switch (age2) {
            case 18:
                System.out.println("С окончанием школы!");
                break;
            case 21:
                System.out.println("Теперь можно пить алкоголь");
                break;
            case 7:
                System.out.println("Иди в школу");
                break;
            default:
                System.out.println("Пока сказать нечего"); //Оператор switch применяют
                // при выборе между несколькими решениями, когда вариантов много и
                // прописывать для каждого if-else будет долго.
        }
        int clientOs = 1; // введите свой вариант
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
else System.out.println("Установите версию приложения для Android по ссылке");
}
public static void task2() {
    System.out.println("Задача 2");
    int clientOs = 1; // введите свой вариант
    int clientDeviceYear = 2015; //введите год
    if (clientDeviceYear > 2014) {
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");
     }
    else if (clientDeviceYear < 2015) {
        if (clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
}
public static void task3() {
    System.out.println("Задача 3");
        int year = 2400;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else
    System.out.println(year + " год не является високосным");
}
public static void task4() {
    System.out.println("Задача 4");
    int deliveryDistance = 220;
    int days = 1;
    if (deliveryDistance < 101) {
        if (deliveryDistance < 20) {}
    if ((deliveryDistance > 20) && (deliveryDistance < 101)) {
        days++;
    }
    if ((deliveryDistance > 60) && (deliveryDistance < 101)) {
        days++;
    }
    System.out.println("Потребуется дней:" + days);}

   else System.out.println("доставки нет.");
}
public static void task5() {
    System.out.println("Задача 5");
        int monthNumber = 17;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no such month");
        }

}
}