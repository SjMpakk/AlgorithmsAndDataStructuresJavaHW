public class SimpleLinkedListImpl implements LinkedList {
    protected Link firstElement;
    protected int size;
    protected Link current;
    protected Link previous;


    public SimpleLinkedListImpl() { // link iterator
        this.size = 0;
        firstElement = null; // new
    }

    @Override
    public void add(int value) {
        Link link = new Link(value);//002
        link.setNext(firstElement);//002.setNext(001)
        firstElement = link;//002 -> 001
        size++;
    }

    @Override
    public Link remove() {
        Link temp = firstElement;
        firstElement = temp.getNext();
        size--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        // return size == 0;
        return firstElement == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Link search(int value) {
        Link currentLink = firstElement;

        while (currentLink != null) {
            if (currentLink.getData() == value) {
                return currentLink;
            }
            currentLink = currentLink.getNext();
        }

        return null;
    }

    @Override
    public Link remove(int value) {
        Link currentLink = firstElement;
        Link previousLink = null;

        while (currentLink != null) {
            if (currentLink.getData() == value) {
                break;
            }
            previousLink = currentLink;
            currentLink = currentLink.getNext();
        }

        if (currentLink == null) {
            return null;
        }

        if (previousLink == null) {
            firstElement = currentLink.getNext();
        } else {
            previousLink.setNext(currentLink.getNext());
        }

        size--;
        return currentLink;
    }

    @Override
    public void display() {
        Link currentLink = firstElement;

        while (currentLink != null) {
            System.out.print(currentLink);
            System.out.print(" -> ");
            currentLink = currentLink.getNext();
        }

        System.out.println();
    }

    @Override
    public Link getFirstElement() {
        return firstElement;
    }

}