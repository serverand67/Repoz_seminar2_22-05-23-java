package homework5;
//        Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что во входной
//        структуре будут повторяющиеся имена с разными телефонами,
//        их необходимо считать, как одного человека с разными телефонами.
//        Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;
public class PhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество записей в телефонной книге:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Введите имя и номер телефона через пробел:");
            String name = scanner.next();
            String phone = scanner.next();
            List<String> phones = phoneBook.get(name);
            if (phones == null) {
                phones = new ArrayList<>();
                phones.add(phone);
                phoneBook.put(name, phones);
            } else {
                phones.add(phone);
            }
        }

        List<Map.Entry<String, List<String>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort(new Comparator<Map.Entry<String, List<String>>>() {
            @Override
            public int compare(Map.Entry<String, List<String>> o1, Map.Entry<String, List<String>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });

        System.out.println("Телефонная книга:");
        for (Map.Entry<String, List<String>> entry : list) {
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.println(name + ": " + phones);
        }
    }

    }

