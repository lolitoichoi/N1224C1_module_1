package ss3_java;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // câu a
//        int i = 1, j = 1;
//        int a = i++ + j++;
//
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
//        System.out.println("a = " + a);

        // câu b
//        int i = 1, j = 1;
//        int a = i++ + ++j;
//
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
//        System.out.println("a = " + a);

        // câu c
//        int i = 1, j = 1;
//        int a = ++i + j++;

//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
//        System.out.println("a = " + a);
//
//        //câu d
//        int i = 1, j = 1;
//        int a = ++i + ++j;
//
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
//        System.out.println("a = " + a);
//
//        //câu e
//        int i = 1, j = 1;
//        int a = i++ + j++ + i++ + j++;
//
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
//        System.out.println("a = " + a);
//
//        // câuf
//        int i = 1, j = 1;
//        int a = ++i + ++j + i++ + j++;
//
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
//        System.out.println("a = " + a);
//
//        // câu g
//        int i = 1;
//        int a = i++ + ++i - i-- - --i;
//
//        System.out.println("i = " + i);
//        System.out.println("a = " + a);

        // câu h
        int a = 10;
        a += a++ +  ++a;
        System.out.println("a = " + a);

    }
}
