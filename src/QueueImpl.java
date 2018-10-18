public class QueueImpl implements QueueInterf{

    public static final int DEFAULT_REAR = -1;
    public static final int DEFAULT_FRONT = 0;
    protected int[] data;
    protected int size;

    private int front; //голова
    private int rear; // хвост

    public QueueImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }



    @Override
    public void insertRight(int value) {
        if (rear == data.length - 1) {
            rear = DEFAULT_REAR;
        }
//        data[++rear] = value;
//        size++;
        else {
            rear++;
        }
        data[rear] = value;
        size++;
        if (size == 1) {
            front = rear;
        }
    }

    @Override
    public void insertLeft(int value) {
        if (front > 0) {
            front--;
        } else {
            front = data.length - 1;
        } data[front] = value;
        size++;
        if (size == 1) {
            rear = front;
        }
    }


    @Override
    public int removeLeft() {
//        int value = data[front++];
//        if (front == data.length) {
//            front = DEFAULT_FRONT;
//        }
//        size--;
//        return value;
        int value = data[front];
        if (front == data.length - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return value;
    }

    @Override
    public int removeRight() {
        int value = data[rear];
        if (rear == 0) {
            rear = data.length - 1;
        } else {
            rear--;
        } size--;
        return value;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display() {
        int currentSize = size;
        int currentFront = front;
        while (currentSize > 0) {
            System.out.println(data[currentFront++]);
            if (front == data.length) {
                currentFront = DEFAULT_FRONT;
            }
            currentSize--;
        }
    }
}
