package functional;

public interface IColorble {

    String RED = "abc";

    void printColor(String color);
    void fly(String color);

    //java 8 : không bắt buộc lớp con phải ghi đè
    default void draw(){
        System.out.println("Bạn đang vẽ");
    }


    static void erase(){// thuộc về thông qua interface / không thể truy cập trực tiếp từ đối tượng

    }

    // java 9  : sử dụng trong nội bộ interface
    private void cut(){

    }

}
