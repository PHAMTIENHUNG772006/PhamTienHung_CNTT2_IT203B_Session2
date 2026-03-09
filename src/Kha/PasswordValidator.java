package Kha;

@FunctionalInterface
public interface PasswordValidator {
    boolean isValid(String password);
}
