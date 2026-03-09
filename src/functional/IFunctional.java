package functional;

import java.util.function.Predicate;

@FunctionalInterface
public interface IFunctional {
    //khái niện function Interface : có 1 duy nhất phương thức trìu tượng
    // đều nằm trong gói java.until.function
    // Các Interface thông dụng
    //Consumer
    //Predicate
    //Function
    //Supplier

    int save(int a,int b);


}
