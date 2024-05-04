package itmo.lab9;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
//task2
    List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("five");
        list.add("one");
        list.add("six");
        Collection<String> newList = task2.withoutDublicats(list);
        System.out.println(list);
        System.out.println(newList);

 //task3
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        task3.makeRandomLists(arrayList, linkedList);
        task3.compareTime(arrayList, linkedList);
//task4
        Map<String, Integer> scoreMap = new HashMap<>();
        User user1 = new User("Ivan");
        scoreMap.put(user1.getName(), 8);
        User user2 = new User("Ira");
        scoreMap.put(user2.getName(), 11);
        User user3 = new User("Ben");
        scoreMap.put(user3.getName(), 4);
        User user4 = new User("Misha");
        scoreMap.put(user4.getName(), 14);
        User user5 = new User("Mary");
        scoreMap.put(user5.getName(), 5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put user name here");
        String userName = scanner.nextLine();

        if(scoreMap.containsKey(userName)){
           int userScore = scoreMap.get(userName);
            System.out.println("User " + userName + " has got " + userScore );
        }
        else {
            System.out.println("User not found");
        }
        scanner.close();
    }
}