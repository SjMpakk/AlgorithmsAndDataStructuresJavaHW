class LinkIterators {
    private Links current;
    private Links previous;
    private LinkedLists lists;

    public LinkIterators(LinkedLists lists) {
        this.lists = lists;
        this.reset();
    }

    public void reset() {
        current = lists.getFirst();
        previous = null;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public Links getCurrent() {
        return current;
    }

    public void insertAfter(String name, int age) {
        Links newLink = new Links(name, age);
        if (lists.isEmpty()) {
            lists.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    public void insertBefore(String name, int age) {
        Links newLink = new Links(name, age);
        if (previous == null) {
            newLink.next = lists.getFirst();
            lists.setFirst(newLink);
            reset();
        } else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public String deleteCurrent() {
        String name = current.name;
        if (previous == null) {
            lists.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }

        return name;
    }

}

class Links {
    public String name;
    public int age;

    public Links next;

    public Links(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }
}

class LinkedLists {
    private Links first;


    public LinkedLists() {
        first = null;

    }

    public Links getFirst() {
        return first;
    }

    public void setFirst(Links first) {
        this.first = first;
    }

    public LinkIterators getIterator() {
        return new LinkIterators(this);
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Links current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}
