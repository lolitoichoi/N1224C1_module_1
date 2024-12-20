package ss8_condition;

public class main {
    public static void main(String[] args) {
        String str = "Hello ";
        str =  str + "World";  // khong the thay doi gia tri

        StringBuilder  sb = new StringBuilder("Hello");  // co the thay doi gia tri
        sb.append("World");
        System.out.println(sb);
    }
}
