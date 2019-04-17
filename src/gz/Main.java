package gz;

import gz.model.User;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "First"));
        users.add(new User(2, "Second"));
        users.add(new User(1, "Hacker"));
        System.out.println("           Initial list: " + users);
        removeDuplicate(users);
        System.out.println("List without duplicates: " + users);
    }


    private static void removeDuplicate(List<User> list) {
        Map<Integer, User> hashMap = new HashMap<>();
        for (User user : list) {
            hashMap.put(user.getId(), user);
        }
        list.clear();
        for (Integer key : hashMap.keySet()) {
            list.add(hashMap.get(key));
        }
    }

}
