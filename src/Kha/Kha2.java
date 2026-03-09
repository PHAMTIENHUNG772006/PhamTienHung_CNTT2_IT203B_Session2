package Kha;

public class Kha2 {
    public static void main(String[] args) {
        PasswordValidator validator = p -> p.length() >= 8;


        System.out.println(validator.isValid("12345678"));
        System.out.println(validator.isValid("1234567"));
    }

}
