public interface StackInterf {

    boolean isEmpty();
    boolean isFull();
    int getSize();
    void display();

    void push (int value); // вставка данных
    int pop (); // извлечение данных
    int peek(); // чтение данных


}
