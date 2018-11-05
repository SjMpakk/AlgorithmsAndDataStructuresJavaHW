public class HashMaps {

    private final static int TABLE_SIZE = 31;


    LinkedHash[] table;


    HashMaps() {

        table = new LinkedHash[TABLE_SIZE];

        for (int i = 0; i < TABLE_SIZE; i++)

            table[i] = null;

    }


    public int get(int key) {

        int hash = (key % TABLE_SIZE);

        if (table[hash] == null)

            return -1;

        else {

            LinkedHash entry = table[hash];

            while (entry != null && entry.getKey() != key)

                entry = entry.getNext();

            if (entry == null)

                return -1;

            else

                return entry.getValue();

        }

    }


    public void put(int key, int value) {

        int hash = (key % TABLE_SIZE);

        if (table[hash] == null)

            table[hash] = new LinkedHash(key, value);

        else {

            LinkedHash entry = table[hash];

            while (entry.getNext() != null && entry.getKey() != key)

                entry = entry.getNext();

            if (entry.getKey() == key)

                entry.setValue(value);

            else

                entry.setNext(new LinkedHash(key, value));

        }

    }


    public void remove(int key) {

        int hash = (key % TABLE_SIZE);

        if (table[hash] != null) {

            LinkedHash prevEntry = null;

            LinkedHash entry = table[hash];

            while (entry.getNext() != null && entry.getKey() != key) {

                prevEntry = entry;

                entry = entry.getNext();

            }

            if (entry.getKey() == key) {

                if (prevEntry == null)

                    table[hash] = entry.getNext();

                else

                    prevEntry.setNext(entry.getNext());

            }

        }

    }

}