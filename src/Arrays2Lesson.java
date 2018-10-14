/**
 * Java HW
 *
 * @author Denisov Alexey
 * @version dated Oct 14, 2018
 */

import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Random;

public class Arrays2Lesson {

    public static void main(String[] args) {
        int size = 10000;
        Array arr = new ArrImpl(size);

//        for (int i = 0; i < ; i++)
//            arr[i] = (int) ( Math.random() * size);
//            for (int i: arr)
//                System.out.println(i + "");
//            System.out.println(arr.add(2));
//            System.out.println(arr.add(56));
//            System.out.println(arr.add(26));
//            System.out.println(arr.add(52));
//            System.out.println(arr.add(82));
//            System.out.println(arr.add(241));

//            arr.display();
//            arr.add(99);
//            arr.display();


        Random rnd = new Random();
        int[] arr1 = new int[size];
            for(int i = 0; i < size; i++)
                arr1[i] = rnd.nextInt(size+1);

            int[] arr2 = Arrays.copyOf(arr1, size);
        int[] arr3 = Arrays.copyOf(arr1, size);

        long start = System.nanoTime();
            Sorts.sortBubble(arr1);
        System.out.println(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start));

        long start1 = System.nanoTime();
        Sorts.sortInsert(arr2);
        System.out.println(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start1));

        long start2 = System.nanoTime();
        Sorts.sortSelect(arr3);
        System.out.println(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start2));



    }
}