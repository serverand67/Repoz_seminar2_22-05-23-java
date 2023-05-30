package homewrk3;

//Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Task1 {
    static Random rnd = new Random();
    static List<Integer> lst = new ArrayList<>();

    public static void main(String[] args) {
// Заполнение списка рандомными числами
            for (int i = 0; i < 10; i++) {
               lst.add(rnd.nextInt(20));
            }
        System.out.println(lst);
            // поиск минимального числа
        System.out.println(Collections.min(lst));
        // поиск максимального числа
        System.out.println(Collections.max(lst));

        // Удаление четные числа
            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i) % 2 == 0) {
                    lst.remove(i);
                    i--;
                }
            }
        System.out.println(lst);
    }




}
