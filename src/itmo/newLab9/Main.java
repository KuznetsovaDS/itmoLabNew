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
        Map<User, Long> scoreMap = new HashMap<>();
        User user1 = new User("Ivan");
        scoreMap.put(user1, 8L);
        User user2 = new User("Ira");
        scoreMap.put(user2, 11L);
        User user3 = new User("Ban");
        scoreMap.put(user3, 4L);
        User user4 = new User("Misha");
        scoreMap.put(user4, 14L);
        User user5 = new User("Mary");
        scoreMap.put(user5, 5L);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put user name here");
        String userName = scanner.nextLine();

        User currentUser = new User(userName);

        if(scoreMap.containsKey(currentUser)){
            Long userScore = scoreMap.get(currentUser);
            System.out.println("User " + userName + " has got " + userScore );
        }
        else {
            System.out.println("User not found");
        }
        scanner.close();
    }

}