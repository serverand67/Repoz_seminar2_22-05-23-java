package homework6;

//        Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//        Реализовать в java.
//        Создать множество ноутбуков (Set).
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии)
//        фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
//        хранить в Map или в Сет. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - цвет
//        2 - бренд
//        3 - цена

import java.util.*;
public class Main {
        public static void main(String[] args) {
            NotebookStore store = new NotebookStore();

            store.addNotebook(new Notebook("Samsung", "черный", 28000));
            store.addNotebook(new Notebook("Apple", "черный", 30000));
            store.addNotebook(new Notebook("Lenovo", "красный", 23000));
            store.addNotebook(new Notebook("Asus", "серый", 28000));
            store.addNotebook(new Notebook("Asus", "черный", 25000));
            store.addNotebook(new Notebook("Apple", "серый", 30000));

            Map<String, String> filters = new HashMap<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите цифру для фильтрации: 1 - brand, 2 - color, 3 - price");
            int criteria = scanner.nextInt();

            switch (criteria) {
                case 1:
                    System.out.println("Введите брэнд:");
                    String brand = scanner.next();
                    filters.put("brand", brand);
                    break;
                case 2:
                    System.out.println("Введите цвет:");
                    String color = scanner.next();
                    filters.put("color", color);
                    break;
                case 3:
                    System.out.println("Введите цену:");
                    int price = scanner.nextInt();
                    filters.put("price", String.valueOf(price));
                    break;
                default:
                    System.out.println("Вы ввели недопустимые данные");
                    break;
            }

            Set<Notebook> filteredNotebooks = store.filterNotebooks(filters);

            if (filteredNotebooks.isEmpty()) {
                System.out.println("Ноутбук не найден");
            } else {
                System.out.println("Ноутбуки отвечающие выбранным критериям:");
                for (Notebook notebook : filteredNotebooks) {
                    System.out.println(notebook.getBrand() + " " + notebook.getColor() + " " + notebook.getPrice());
                }
            }
        }
    }

