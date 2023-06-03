package homework4;

//Пусть дан LinkedList с несколькими элементами.Реализуйте метод, который вернет “перевернутый” список.
//        Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди, dequeue()
//        - возвращает первый элемент из очереди и удаляет его, first()
//        - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Task1 {
    static LinkedList<Integer> linkedList = new LinkedList<>();
    public static void main(String[] args) {
        AddLinkedList();
        Enqueue();
        Dequeue();
        First();
        Reverse();
    }

    private static void AddLinkedList() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
    }

    private static void Enqueue(){
        linkedList.addLast(5);
        System.out.println(linkedList);
    }

    private static void Dequeue(){
        linkedList.poll();
        System.out.println(linkedList);
    }

    private static void First(){
        linkedList.peek();
        System.out.println(linkedList);
    }

    private static void Reverse(){

        LinkedList revers = new LinkedList();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            revers.add(linkedList.get(i));
        }
        System.out.println(revers);

    }



}
