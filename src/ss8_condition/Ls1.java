package ss8_condition;

public class Ls1 {
    public static void main(String[] args) {

        // lay ra chu world
        String str = "Hello World";

        StringBuffer stringBuffer = new StringBuffer(str);

        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.println(stringBuffer.substring(6));
        System.out.println(stringBuilder.substring(6));

        // thay o bằng f
//        System.out.println(stringBuilder.replace('o', 'f', "Hello World");


        // Noi hai chuoi

        String str1 = "Hello";
        String str2 = "World";

        StringBuffer stringBuffer1 = new StringBuffer(str1);

        StringBuilder stringBuilder1 = new StringBuilder(str2);

        stringBuffer1.append(str2);
        stringBuilder1.append(str2);
        System.out.println(stringBuffer1);
        System.out.println(stringBuilder1);

        // cau d doan code tạo ra bao nhiu đôi tượng và kết quả là gì
        String a = "A";
        String b = new String("B");
        String c = "A";
        b.concat("B");
        String d = c.concat("C");
        StringBuffer e = new StringBuffer("E");
        e.append("F");
        StringBuilder g = new StringBuilder("G");
        g.append("H");
        System.out.println(a + b + c + d + e + g);

        // => tạo ra 5 đối tượng kết quả sẽ ra A,B,A,AC,EF,GH



//        CHỨNG MINH SỰ KHÁC BIỆT
//        String s1 = "Hello";
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//        StringBuffer stringBuffer = new StringBuffer();
//
//        s1 = s1 + "World"; // theo kiểu string không thể tạo thay đổi giá trị ban đầu nên ở đây sẽ tạo ra đối tượng mới là World
//
//        stringBuilder.append("World"); // không tạo ra đối tượng mơới nhưng có thể thay đổi giá trị
//
//        stringBuffer.append("World"); // không tạo ra đối tượng mơới nhưng có thể thay đổi giá trị
//
//        System.out.println(s1);
//        System.out.println(stringBuilder);
//        System.out.println(stringBuffer);
    }
}
