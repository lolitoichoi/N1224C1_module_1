package ss6_condition;

public class vidu {
    public static void main(String[] args) {

        int a = 2;
        changData(a);
        System.out.println(a);

        /*
        tham trị : giá trị không thay đổi khi ra khỏi hàm
        tham chiếu : giá trị thay dổi khi ra khỏi hàm
         */
    }

    public static void changData(int x) {
        x = 100;

//        String str1 = "nguyen van tuan";
//        String str2 = "nguyen van tuan";
//        String str3 = new String("nguyen van tuan");
//
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
//
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3));
    }
}
