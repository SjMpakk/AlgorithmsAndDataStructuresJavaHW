

public class StackImpl implements StackInterf {

    private int[] arr;
    private int size;

    public StackImpl(int maxSize) {
        this.arr = new int[maxSize];
        this.size = 0;
    }

    protected static void addToStack(StackInterf stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size >= arr.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display() {
//        for (int i = 0; i < size ; i++) {
//            System.out.println(arr[i]);
//        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    @Override
    public void push(int value) {
        arr[size++] = value;
    }

    @Override
    public int pop() {
        return arr[--size];
    }

    @Override
    public int peek() {
        return arr[size - 1];
    }
}
