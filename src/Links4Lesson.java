/**
 *
 * Java home work 4 lesson
 *
 * @author Denisov Alexey
 * @version dated Oct 22, 2018
 */

import java.util.List;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Links4Lesson {
    public static void main(String[] args) {
//        LinkedList list = new SimpleLinkedListImpl();
//        TwoSideLinkedList list = new TwoSideLinkedListImpl();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        list.addLast(5);
//        list.addLast(6);
//
//
//        list.display();
//
//        System.out.println(list.remove());
//        System.out.println(list.remove(8));
//
//        list.display();
//
//        System.out.println("Find 2: " + list.search(2));
//        System.out.println("Find 9: " + list.search(9));
//
//        System.out.println("out");
//
//        while (!list.isEmpty()) {
//            System.out.println(list.remove());
//        }
//
//        System.out.println("test stack");
//        testStack();
//
//        System.out.println("test queue");
//        testQueue();

//        testIterator();

        testLinkIter();

    }

    private static void testIterator() {
        List<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        for (Integer value : linkedList) {
//            linkedList.remove(0);
            System.out.println(value);
        }

        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();

            iterator.remove();
//            iterator.set(0);
//        }
        }
        System.out.println("after iterator");
        for (Integer value : linkedList) {
        }

//        linkedList.add(linkedList.remove(0));

//        SimpleLinkedListImpl list = new SimpleLinkedListImpl();
//        for (Link value : list) {
//            System.out.println(value);
//        }

    }


    private static void testStack() {
        StackInterf stack = new LinkedStackImpl();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

//        stack.pop();
        stack.pop();

        System.out.println("peek: " + stack.peek());

        System.out.println("display:");
        stack.display();


        System.out.println("display and clear:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("stack is empty: " + stack.isEmpty());
    }

    private static void testQueue() {
        QueueInterf queue = new LinkedQueueImpl();
        queue.insertRight(1);
        queue.insertRight(2);
        queue.insertRight(3);
        queue.insertRight(4);
        queue.insertRight(5);
        queue.insertRight(6);

        queue.display();
        System.out.println("remove");
        queue.removeLeft();
        queue.removeLeft();
        queue.display();

        System.out.println("display and clear");

        while (!queue.isEmpty()) {
            System.out.println(queue.removeLeft());
        }

        System.out.println("queue is empty: " + queue.isEmpty());
    }

    private static void testLinkIter() {
        LinkedLists list = new LinkedLists();
        LinkIterators iter = new LinkIterators(list);
        iter.insertAfter("Max", 20);
        iter.insertAfter("Tom", 18);
        iter.insertBefore("Mary", 27);
        iter.insertAfter("Joe", 33);

        list.display();
        System.out.println("delete");
        iter.atEnd();
        iter.deleteCurrent();
        list.display();
        System.out.println("reset");
        iter.reset();
        iter.insertBefore("Tim", 21);
        list.display();
    }
}
