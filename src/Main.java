//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        boolean clientOS = true;
        if (clientOS == true){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else System.out.println("Установите версию приложения для iOS по ссылке");
        System.out.println(" ");

        System.out.println("Задача № 2");
        int clientDeviceYear = 2010;
        if (clientDeviceYear >= 2015){
            if (clientOS == true){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == true) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        System.out.println(" ");

        System.out.println("Задача № 3");
        int year = 2021;
        int originalYear = 1584;
        if (year >= originalYear &&  year % 4 == 0){
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високостным");
        System.out.println(" ");

        System.out.println("Задача № 4");
        int deliveryDistance = 95;
        int days = 2;
        if (deliveryDistance > 100){
            System.out.println("Свыше " + deliveryDistance + " км. доставки нет...");
        } else if (deliveryDistance <= 20){
            System.out.println("Доставка в пределах " + deliveryDistance + " км, занимает сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах от 20 км. до 60 км. займёт " + days + " день");
        } else { days = days + 1;
            System.out.println("Доставка в пределах от 60 км. до 100 км. займёт " + days + " дней");
        }
        System.out.println(" ");

        System.out.println("Задача № 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима...");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна...");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето...");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень...");
                break;
            default:
                System.out.println("В году всего 12 месяцев...");
        }
    }
}