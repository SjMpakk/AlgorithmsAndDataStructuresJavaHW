/**
 * Java home work 8
 *
 * @author Denisov Alexey
 * @version dated Nov 05, 2018
 */

import java.util.HashMap;
import java.util.Map;

public class HashTables {
    public static void main(String[] args) {

//        basicHashMap();
        testHashMaps();
//        testHashtable();
    }

    private static void basicHashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 123);
        map.put("B", 789);
        map.put("C", 456);


        System.out.println(map.get("B"));
        System.out.println(map.containsKey("A"));


    }

    private static void testHashMaps() {
        HashMaps hashMaps = new HashMaps();

        hashMaps.put(2, 12);
        hashMaps.put(3, 32);
        hashMaps.put(1, 52);
        hashMaps.put(5, 52);
        hashMaps.put(7, 72);

        System.out.println(hashMaps.get(5));
        System.out.println(hashMaps.get(1));

        hashMaps.remove(7);

        System.out.println(hashMaps.get(7));


    }

    private static void testHashtable() {
        HashTable hashTable = new HashTable(10);

        Item item1 = new Item(2);
        Item item2 = new Item(7);
        Item item3 = new Item(32);
        Item item4 = new Item(15);
        Item item5 = new Item(17);

        hashTable.insert(item1);
        hashTable.insert(item2);
        hashTable.insert(item3);
        hashTable.insert(item4);
        hashTable.insert(item5);

        hashTable.display();


        System.out.println("Find 15:" + hashTable.find(15));
        System.out.println("Find 32:" + hashTable.find(32));
        System.out.println("Find 50:" + hashTable.find(50));

        hashTable.remove(2);
        hashTable.remove(item5);//17

        System.out.println("---");

        hashTable.display();
    }
}