package ss8_condition;

public class main {
    public static void main(String[] args) {
//        String str = "Hello ";
//        str =  str + "World";  // khong the thay doi gia tri
//
//
//        StringBuilder stringBuilder = new StringBuilder("Hello");  // co the thay doi gia tri
//        stringBuilder.append("World");
//        System.out.println(stringBuilder);

        String name = "Hello World";

        StringBuilder stringBuilder = new StringBuilder(name);  // dao nguoc chuoi
        name= stringBuilder.reverse().toString();
        System.out.println("Dao nguoc chuoi : " + name);



    }
}
