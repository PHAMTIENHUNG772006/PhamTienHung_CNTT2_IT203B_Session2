package Kha;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Kha1 {
    public static void main(String[] args) {
//        Kiểm tra xem một User có phải là Admin hay không (trả về true/false). : sử dụng Predicate

        Predicate<String> predicate = str -> str.equals("admin");

        System.out.println(predicate.test("client"));
        System.out.println(predicate.test("admin"));

        // kiểm tra dữ liệu đầu vào có phải là admin hay không nếu đúng trả về true sai trả về false

//        Chuyển đổi một đối tượng User thành một chuỗi String chứa thông tin username.: sử dụng Function

        User user = new User("US001","Hưng");
        Function<User,String> name = temp -> "Tên : " +   user.getName() ;
        System.out.println(name.apply(user));

        // Nhận vào  giá trị là User → trả về một chuỗi string là name đã được biến đổi

//        In thông tin chi tiết của User ra màn hình Console.: sử dụng Consumer

        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("Hello");

        // giúp tiêu hóa , xử lý dữ liệu truyền vào
//         Khởi tạo một đối tượng User mới với các giá trị mặc định.: sử dụng Supplier

        Supplier<User> userSupplier = () -> new User("SV002","Quang");

        System.out.println(userSupplier.get().toString());

        // để khởi tạo dữ liệu cho đối tượng String

    }
}
