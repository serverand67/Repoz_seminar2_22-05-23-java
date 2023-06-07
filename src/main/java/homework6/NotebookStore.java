package homework6;

import java.util.*;
public class NotebookStore {
    private final Set<Notebook> notebooks;

    public NotebookStore() {
        notebooks = new HashSet<>();
    }

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public Set<Notebook> getNotebooks() {
        return notebooks;
    }

    public Set<Notebook> filterNotebooks(Map<String, String> filters) {
        Set<Notebook> filteredNotebooks = new HashSet<>(notebooks);

        for (Map.Entry<String, String> entry : filters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            switch (key) {
                case "brand":
                    filteredNotebooks.removeIf(notebook -> !notebook.getBrand().equals(value));
                    break;
                case "color":
                    filteredNotebooks.removeIf(notebook -> !notebook.getColor().equals(value));
                    break;
                case "price":
                    filteredNotebooks.removeIf(notebook -> notebook.getPrice() > Integer.parseInt(value));
                    break;
                default:
                    System.out.println("Вы ввели недопустимые данные");
                    break;
            }
        }

        return filteredNotebooks;
    }
}
