package functional;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        IColorble obj = new Shape();


        obj.printColor("Red");

        obj.draw();

        obj.fly("hưng");


        // Lambda là một hàm được tạo ra để

        // trước java 8

//        IFunctional functional = new IFunctional() { // IFunctional không phải là một constructor mà là một lớp nặc danh được kế thừa của Ìunctional
//            @Override
//            public void save() {
//
//            }
//        };

        // Lambda expression  : cú pháp ngắn gọn khi code
        IFunctional lb = (a,b) -> 1;

        Comparator<Shape> com1 = (c1,c2) -> -1;
        Comparator<Shape> com2 = (c1,c2) -> 1;

//        Collections.sort((a,b) -> a - b);


    }
}
