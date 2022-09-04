public class Main {
    public static void main(String[] args) {

        //Задание 1
        var clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }

        //Задание 2
        var aclientOS=0;
        var yearProduction=2014;
        if (aclientOS==0 && yearProduction>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (aclientOS==0 && yearProduction<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (aclientOS==1 && yearProduction>=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (aclientOS==1 && yearProduction<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (aclientOS<0 || aclientOS>1) {
            System.out.println("Ошибка");
        }

        //Задание 3
        var year=2022;
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }

        //Задание 4
        var deliveryDistance=25;
        var day=1;
        if (deliveryDistance>20) {
            day++;
        }
        if (deliveryDistance>60) {
            day++;
        }
        System.out.println("На доставку потребуется "+day+" дней");

        //Задание 5
        var month=8;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц "+month+" сейчас зима");
                break;
            case 4:
            case 5:
            case 3:
                System.out.println("Месяц "+month+" сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц "+month+" сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц "+month+" сейчас осень");
                break;
            default:
                System.out.println("Месяц "+month+" н существует!");
        }
    }
}