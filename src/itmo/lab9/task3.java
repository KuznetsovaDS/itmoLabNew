package itmo.lab9;

import java.util.ArrayList;
import java.util.LinkedList;

public class task3 {
    public static void makeRandomLists(ArrayList<Double> arrayList, LinkedList<Double> linkedList){
        for (int i = 0; i < 1000000; i++){
            double randomNum = Math.random() * 1000000;
            arrayList.add(randomNum);
            linkedList.add(randomNum);
        }
    }
    public static void chooseRandomArray(ArrayList<Double> arrayList){
        for (int n = 0; n < 100; n++){
            arrayList.get((int) (Math.random() * arrayList.size()));
          }
    }
    public static void chooseRandomLinked(LinkedList<Double> linkedList){
        for (int n = 0; n < 100; n++){
            int randomIndex = (int) (Math.random() * linkedList.size());
            linkedList.get(randomIndex);
        }
    }
    public static void compareTime(ArrayList<Double> arrayList, LinkedList<Double> linkedList){
        long startTimeArray = System.currentTimeMillis();
        chooseRandomArray(arrayList);
        long endTimeArray = System.currentTimeMillis();
        long longTimeArray = endTimeArray - startTimeArray;
        System.out.println("Время для arraylist " + longTimeArray );

        long startTimeLinked = System.currentTimeMillis();
        chooseRandomLinked(linkedList);
        long endTimeLinked = System.currentTimeMillis();
        long longTimeLinked = endTimeLinked - startTimeLinked;
        System.out.println("Время для linkedlist " + longTimeLinked );

        if (longTimeArray < longTimeLinked){
            System.out.println("ArrayList быстрее");
        }
        else if (longTimeArray > longTimeLinked){
            System.out.println("LinkedList быстрее");
        }
        else {
            System.out.println("Время одинаково");
        }
    }
}
