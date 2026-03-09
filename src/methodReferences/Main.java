package methodReferences;

import java.util.*;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hưng", "Quang", "Anh");

        for (String name : names) {
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();


        while (iterator.hasNext()) {
            String name = iterator.next();


            System.out.println(name);
        }


        names.forEach(s -> System.out.println(s));


        names.forEach(Printer::print);

        /*
        Cách sử dụng
        ClassNam :: method
        objName:: method
        ClassName :: new hàm tạo
         */

        List<Student> students = names.stream()
                .map(Student::new)
                .toList();


        students.forEach(s -> System.out.println(s));//Consumer


        students.stream()
                .filter(student -> student.getName().contains("h"))
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);


        Random rad = new Random();

        List<Integer> lists = Stream.generate(() -> rad.nextInt(10))
                .limit(20)
                .toList();

        lists.stream().filter((a -> a % 3 == 0)).forEach(a -> System.out.println(a));//Predicate


        lists.stream()
                .map(a -> Math.pow(a, 3))
                .forEach(a -> System.out.println(a));//Function


        double total = lists.stream()
                .reduce(0, (a, b) -> a + b);//Lambda
        System.out.println(total);
    }
}