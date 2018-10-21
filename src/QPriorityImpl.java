public class QPriorityImpl implements QueueInterf{
    private int[] data;
    private int size;

    public QPriorityImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
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
        int queueIndex = 0;
        if (isEmpty()) {
            data[size++] = value;
        }
        else {
            for (queueIndex = size - 1; queueIndex >= 0; queueIndex--) {
                if (value > data[queueIndex]) {
                    data[queueIndex + 1] = data[queueIndex];
                }
                else {
                    break;
                }
            }
            data[queueIndex + 1] = value;
            size++;
        }
    }

    @Override
    public void insertLeft(int value) {

    }


    @Override
    public int removeRight() {
        return 0;
    }

    @Override
    public int removeLeft() {
        return data[--size];
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display() {

    }
}
