package Lesson2;

import Lesson2.Podarok.Bonbon;
import Lesson2.Podarok.Candy;
import Lesson2.Podarok.Presents;

import java.util.Scanner;


public class Task5 {

    public static void main(String[] args) {

        int sum = 0;
        int massa = 0;

        Bonbon b1 = new Bonbon("Барбарис", 200, 100, "круглая", '1');
        Candy c1 = new Candy("Мишка на севере", 100, 90, "желе", '2');
        Bonbon b2 = new Bonbon("Леденец", 200, 50, "овальная", '3');

        Presents[] Box = {b1, c1, b2};

        System.out.println("У нас есть следующие подарки");   //просто выводим инфу по имеющемуся пулу подарков
        for (Presents p1 : Box) {
            System.out.println(p1.toString());
            sum = sum + p1.getAmount();
            massa = massa + p1.getVes();
        }

        System.out.println("Общий вес подарка: " + massa + " грамм");  //считаем общую массу и стоимость подарков
        System.out.println("Стоимость подарка: " + sum + " руб.");

        Scanner sc = new Scanner(System.in);

        int dl = 0;  //длина массива выбранных подарков (количество dl в итоге равно количеству выбранных подарков)
        String str = sc.next();
        char[] mas = str.toCharArray(); //массив для всего, что будет введено с клавиатуры при выборе подарка


        for (int i = 0; i < mas.length; i++) {  //заполняем массив всего, что будет введено с клавы - mas, СЧИТАЕМ КОЛИЧЕСТВО ВЫБРАННЫХ ПОДАРКОВ DL.
            if (mas[i] != ',') {
                dl = dl + 1;
            }
        }

        char[] itog = new char[dl];   //этот массив мы заполняем итоговыми id подарков, исключаем запятые, оставляем только айдишники
        for (int i = 0; i < dl; i++) {
            for (int j = i * 2; j < mas.length; j++) {
                if (mas[j] != ',') {
                    itog[i] = mas[j];
                    j = mas.length;
                }
            }
        }

        sum = 0;   //обнуляем массу и цену, т.к. они нам снова нужны для расчета итоговой корзины подарков
        massa = 0;
        System.out.println("Вы выбрали следующий подарок:");

        for (Presents p1 : Box) {

            for (int i = 0; i < dl; i++) {
                if (itog[i] == p1.getId()) {  // если выбранный айди совпадает с айди подарка из пула подарков, то
                    System.out.println(p1.toString());  // печатаем на экран то, что выбрал пользователь
                    sum = sum + p1.getAmount();  //считаем сумму и массу
                    massa = massa + p1.getVes();

                    break;
                }
            }

        }

        System.out.println("Общий вес подарка: " + massa + " грамм");
        System.out.println("Стоимость подарка: " + sum + " руб.");
        sc.close();
    }

}


















