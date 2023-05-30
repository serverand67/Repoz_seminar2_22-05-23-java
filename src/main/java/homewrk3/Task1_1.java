package homewrk3;

//Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1_1 {
    static Random rnd = new Random();
    static List<Integer> lst = new ArrayList<>();
    public static void main(String[] args) {
        FillLst();
        MinMaxInList();
        RemovingEvenNum();
        NumbersAvg();
    }
// метод заполнения и вывода списка
    private static void FillLst() {
        // Заполнение списка рандомными числами
        for (int i = 0; i < 10; i++) {
            lst.add(rnd.nextInt(20));
        }
        System.out.println(lst);
    }

    // метод вывода минимального и максимального числа
    private static void MinMaxInList() {
        // поиск минимального числа
        System.out.println(Collections.min(lst));
        // поиск максимального числа
        System.out.println(Collections.max(lst));
        }

    // метод удаления четных чисел из списка и вывода его в консоль
    private static void RemovingEvenNum() {
        // Удаление четных чисел
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) % 2 == 0) {
                lst.remove(i);
                i--;
            }
        }
        System.out.println(lst);
    }

    // метод выводит среднее значение
    private static void NumbersAvg() {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            int num = lst.get(i);
            sum += num;
        }
        double avg = (double) sum / lst.size();
        System.out.println(avg);
    }
    }




