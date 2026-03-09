package BTTH;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UserManagement {

    public static void main(String[] args) {
        Supplier<User> user = () -> new User("Hưng","hung@gmail.com","user","active");

        Predicate<User> predicate = IUserAccount::checkAccess;

        Predicate<User> isActive = u -> u.getStatus().toUpperCase().equals("ACTIVE");

        Function<User,String> getEmail = User::getEmail;

        System.out.println("User: " + user.get().toString());
        System.out.println("Is Active: " + isActive.test(user.get()));
        System.out.println("Email: " + getEmail.apply(user.get()));

        List<User> users = new ArrayList<>();

        users.add(new User("Nam","nam@gmail.com","USER","ACTIVE"));
        users.add(new User("An","an@gmail.com","USER","INACTIVE"));
        users.add(new User("Lan","lan@gmail.com","ADMIN","ACTIVE"));
        users.add(new User("Quang","quang@gmail.com","ADMIN","ACTIVE"));


        System.out.println("\nDanh sách User:");
        users.forEach(System.out::println);
    }
}
