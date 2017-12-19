package Lesson2;

public class Task4 {

    public static void main(String[] args) {
        //объявляем массив
        int maxmin[] = new int[20];
        //заполняем массив рандомными числами от -10 до 10
        for (int i = 0; i < maxmin.length; i++) {
            maxmin[i] = rand(); //((int) (Math.random() * 21) - 10);
            System.out.println("Элемент номер " + (i) + ": " + maxmin[i]);
        }

        //переменные для хранения отрицательного и положительного значения
        int maxotr = -11, minpoloj = 11;

        //переменные для хранения номера положительного и отрицательного значения
        int nOtr = 0, nPol = 0;

        for (int i = 0; i < maxmin.length; i++) {
            //ищем максимальное отрицательное
            if (maxmin[i] < 0) {     // проверка, что элемент отрицательный
                if (maxmin[i] > maxotr) {
                    maxotr = maxmin[i];
                    nOtr = i;
                }
            }
            //ищем минимальное положительное
            if (maxmin[i] > 0) {     // проверка, что элемент отрицательный
                if (maxmin[i] < minpoloj) {
                    minpoloj = maxmin[i];
                    nPol = i;
                }
            }
        }
        //вывод результата по отрицательным
        if (maxotr == -11) {
            System.out.println("В массиве нет отрицательных элементов");
        } else {
            System.out.println("Максимальное отрицательное: " + maxotr + " под номером " + nOtr);
        }

        // вывод результата по положительным
        if (minpoloj == 11) {
            System.out.println("В массиве нет положительных элементов");
        } else {
            System.out.println("Минимальное положительное: " + minpoloj + " под номером " + nPol);
        }

        System.out.println("Значения поменяны местами. Итоговый вид массива:");
        //меняем местами
        maxmin[nOtr] = maxmin[nOtr] + maxmin[nPol];
        maxmin[nPol] = maxmin[nOtr] - maxmin[nPol];
        maxmin[nOtr] = maxmin[nOtr] - maxmin[nPol];
        //выводим результат
        for (int i = 0; i < maxmin.length; i++) {
            System.out.println("Элемент номер " + (i) + ": " + maxmin[i]);
        }
    }

    public static int rand() {
        return ((int) (Math.random() * 21) - 10);
    }
}
