public class DequeueCommands {
    public static void Commands() {
        QueueInterf queue = new QueueImpl(10);
        addToQueueRight(queue, 3);
        addToQueueRight(queue, 4);
        addToQueueRight(queue, 5);
        addToQueueRight(queue, 6);
        addToQueueRight(queue, 7);
        addToQueueRight(queue, 8);
        addToQueueRight(queue, 9);

        queue.display();
        System.out.println("удаление справа");
        queue.removeRight();
        queue.display();
        System.out.println("удаление слева");
        queue.removeLeft();
        queue.display();
        System.out.println("добавление элемента слева");
        addToQueueLeft(queue, 12);
        queue.display();

    }


    private static void addToQueueRight(QueueInterf queue, int value) {
        if (!queue.isFull()) {
            queue.insertRight(value);
        }
    }

    private static void addToQueueLeft(QueueInterf queue, int value) {
        if (!queue.isFull()) {
            queue.insertLeft(value);
        }
    }
}

