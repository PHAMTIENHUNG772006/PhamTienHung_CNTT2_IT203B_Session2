package Gioi;

public interface Authenticatable {
    abstract String getPassword();

    default boolean isAuthenticated() {
        return getPassword() != null && !getPassword().isEmpty();
    }

    static String  encrypt(String rawPassword) {
        return "pas_" + rawPassword;
    }
}
