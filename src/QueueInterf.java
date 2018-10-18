public interface QueueInterf {

    boolean isEmpty();
    boolean isFull();

    void insertRight(int value); //добавлениие в конец очереди
    void insertLeft(int value); // добавление в начало очереди
    int removeLeft(); // удаление из начала очереди
    int removeRight(); // удаление из конца очереди
    int getSize();
    void display();
}
