package homewrk3;

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
    }
// метод заполнения списка
    private static void FillLst() {
        // Заполнение списка рандомными числами
        for (int i = 0; i < 10; i++) {
            lst.add(rnd.nextInt(20));
        }
        System.out.println(lst);
    }

    // метод вывод минимального и максимального числа
    private static void MinMaxInList() {
        // поиск минимального числа
        System.out.println(Collections.min(lst));
        // поиск максимального числа
        System.out.println(Collections.max(lst));
        }

    // метод удаления четных чисел из списка
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
    }




