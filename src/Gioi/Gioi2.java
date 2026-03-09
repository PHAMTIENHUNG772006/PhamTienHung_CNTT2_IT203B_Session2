package Gioi;

import java.util.ArrayList;
import java.util.List;

public class Gioi2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("U001","Hưng"));
        users.add(new User("U002","Hoàn"));
        users.add(new User("U003","Quang"));
        users.add(new User("U004","Sơn"));

        users.stream()
                .map(User::getName)
                .forEach(System.out::println);
    }
}
