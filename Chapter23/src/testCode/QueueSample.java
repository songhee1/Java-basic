package testCode;

import java.util.LinkedList;

public class QueueSample {

    public static void main(String[] args) {
        QueueSample sample = new QueueSample();
        sample.checkLinkedList();

    }

    private void checkLinkedList() {
        LinkedList<String> list = new LinkedList<>(); // offer boolean 리턴
        list.offer("A");
        list.offerFirst("B");
        System.out.println(list);

        list.offerFirst("C");
        System.out.println(list);

        list.offerLast("D");
        System.out.println(list);

        list.add(0, "H");
        System.out.println(list);

        list.set(0, "I");
        System.out.println(list);
    }
}
