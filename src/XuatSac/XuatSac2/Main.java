package XuatSac.XuatSac2;

public class Main {
    public static void main(String[] args) {
        User user = new User("SV001","Hưng");

        UserProcessor processor = UserUtils::convertToUpperCase;

        String result = processor.process(user);

        System.out.println("Username sau khi xử lý: " + result);
    }
}
