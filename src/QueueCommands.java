public class QueueCommands {
    public static void Commands() {
        QueueInterf queue = new QueueImpl(3);
        addToQueue(queue, 1);
        addToQueue(queue, 2);
        addToQueue(queue, 3);
        addToQueue(queue, 5);
        addToQueue(queue, 7);
        addToQueue(queue, 9);

        queue.display();
        System.out.println("удаление");
        queue.removeLeft();
        queue.display();

        System.out.println("вывод на дисплей + очистка");

        while (!queue.isEmpty()) {
            System.out.println(queue.removeLeft());
        }

        System.out.println("очередь пуста: " + queue.isEmpty());
    }

    private static void addToQueue(QueueInterf queue, int value) {
        if (!queue.isFull()) {
            queue.insertRight(value);
        }
    }
}