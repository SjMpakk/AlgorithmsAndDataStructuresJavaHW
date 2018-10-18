public class QPriorityCommands {
    public static void Commands() {
        QueueInterf queue = new QPriorityImpl(12);
        addToQueue(queue, 15);
        addToQueue(queue, 25);
        addToQueue(queue, 78);
        addToQueue(queue, 5);
        addToQueue(queue, 2);
        addToQueue(queue, 41);


        while (!queue.isEmpty()) {
            System.out.println(queue.removeLeft());
        }
        System.out.println("оставшийся размер массива " + queue.getSize());
    }
    private static void addToQueue(QueueInterf queue, int value) {
        if (!queue.isFull()) {
            queue.insertRight(value);
        }
    }
}