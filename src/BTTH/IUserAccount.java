package BTTH;

public interface IUserAccount {
    abstract String getRole();

    default boolean checkAccess(){
        if (getRole().toUpperCase().equals("ADMIN")){
            return true;
        }

        return false;
    }

    static boolean isStandardLength(String username){
        if (username.length() > 5){
            return true;
        }
        return false;
    }
}
