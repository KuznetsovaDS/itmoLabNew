package itmo.newLab9;
import java.util.*;

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
        itmo.newLab9.task3.makeRandomLists(arrayList, linkedList);
        task3.compareTime(arrayList, linkedList);
//task4
        Map<String, Integer> scoreMap = new HashMap<>();
        itmo.newLab9.User user1 = new itmo.newLab9.User("Ivan");
        scoreMap.put(user1.getName(), 8);
        itmo.newLab9.User user2 = new itmo.newLab9.User("Ira");
        scoreMap.put(user2.getName(), 11);
        itmo.newLab9.User user3 = new itmo.newLab9.User("Ben");
        scoreMap.put(user3.getName(), 4);
        itmo.newLab9.User user4 = new itmo.newLab9.User("Misha");
        scoreMap.put(user4.getName(), 14);
        itmo.newLab9.User user5 = new itmo.newLab9.User("Mary");
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