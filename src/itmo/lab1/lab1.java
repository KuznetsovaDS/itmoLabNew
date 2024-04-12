package itmo.lab1;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        double result1 = (45.0 + 10) * (10.0 / 3);
        int result2 = 29 * 4 * (-15);
        System.out.println("Первый ответ " + result1);
        System.out.println("Второй ответ " + result2);

        int number = 10500;
        double result = ((double)number / 10) / 10;
        System.out.println("Результат 3-го задания " + result);

        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        double result4 = num1 * num2 * num3;
        System.out.println("Результат 4-го задания " + result4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Введите число");
        int b = scanner6.nextInt();

        if ( b % 2 != 0 ) {
            System.out.println("Нечетное ");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}

