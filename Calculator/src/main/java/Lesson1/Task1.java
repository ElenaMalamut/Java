package Lesson1;

import java.util.Scanner;  //импортируем сканнер

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte proga;

        System.out.println("Введите в консоли: 1 - если хотите запустить калькулятор, 2 - если хотите запустить поиск максимального слова");

        proga = sc.nextByte();
        if (proga == 1) {
            System.out.println("Запущен калькулятор");
        /* объявляем переменные:
        а - первое число,
        b - второе,
        res - результат
        Все дабловское, т.к. нужны числа с плавающей запятой
        */
            double a, b, res;
            //вводим первое число
            System.out.println("Введите первое число ");
            a = sc.nextDouble();
            //вводим второе число
            System.out.println("Введите второе число ");
            b = sc.nextDouble();
            System.out.println("Введите символ операции, которую необходимо выполнить:" +
                    " + - сложение; " +
                    "- - вычитание; " +
                    "* - умножение; " +
                    "/ - деление");
            char znak = sc.next().charAt(0);   //переменная, отвечающая за действие с цифрами

            if (znak == '+') {
                //суммируем числа и выводим результат
                res = sum(a, b);
                System.out.printf("Сумма равна %.4f", res);
            } else if (znak == '-') {
                //вычитаем числа и выводим результат
                res = minus(a, b);
                System.out.printf("Разность равна %.4f", res);
            } else if (znak == '*') {
                //умножаем числа и выводим результат
                res = proizv(a, b);
                System.out.printf("Произведение равно %.4f", res);
            } else if ((znak == '/') && (b == 0)) { //проверяем, что делитель не равен нулю
                System.err.println("Ошибка! Делитель равен нулю");
            } else if ((znak == '/') && (b != 0)) //делим числа и выводим результат
            {
                res = delen(a, b);
                System.out.printf("Деление равно %.4f", res);
            }
        } else if (proga == 2) {
            System.out.println("Запущен поиск самого длинного слова");
            System.out.println("Введите размерность массива");
            //тянем с консоли размерность массива
            int n = sc.nextInt();
            String[] kuchaslov = new String[n];
            int maxDlina = 0;
            int nomElementa = 0;

            //заполняем массив словами
            for (int i = 0; i < kuchaslov.length; i++) {
                System.out.println("Введите слово № " + (i + 1));
                kuchaslov[i] = sc.next();
            }

            //ищем слово с максимальной длиной
            for (int i = 0; i < kuchaslov.length; i++) {
                if (kuchaslov[i].length() > maxDlina) {
                    maxDlina = kuchaslov[i].length();
                    nomElementa = i;
                }
            }

            System.out.println("Элемент *" + kuchaslov[nomElementa] + "* имеет максимальную длину среди массива, равную " + maxDlina);
        } else System.err.println("Вы ввели какую-то чушь");

        sc.close();

    }


    // метод сложения чисел
    public static double sum(double x, double y) {
        return (x + y);
    }

    //метод для подсчета разности
    public static double minus(double x, double y) {
        return (x - y);
    }

    // метод для умножения
    public static double proizv(double x, double y) {
        return (x * y);
    }

    //метод для деления
    public static double delen(double x, double y) {
        return (x / y);
    }

}
