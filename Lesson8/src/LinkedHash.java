public class LinkedHash {

    private int key;

    private int value;

    private LinkedHash next;



    LinkedHash(int key, int value) {

        this.key = key;

        this.value = value;

        this.next = null;

    }



    public int getValue() {

        return value;

    }



    public void setValue(int value) {

        this.value = value;

    }



    public int getKey() {

        return key;

    }



    public LinkedHash getNext() {

        return next;

    }



    public void setNext(LinkedHash next) {

        this.next = next;

    }

}