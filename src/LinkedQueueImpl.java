public class LinkedQueueImpl implements QueueInterf{
    private TwoSideLinkedList linkedList;

    public LinkedQueueImpl() {
        this.linkedList = new TwoSideLinkedListImpl();
    }

    @Override
    public void insertLeft(int value) {
        linkedList.addLast(value);
    }

    @Override
    public int removeLeft() {
        return 0;
    }

    @Override
    public int removeRight() {
        return linkedList.remove().getData();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void insertRight(int value) {

    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public void display() {
        linkedList.display();
    }
}
