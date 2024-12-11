package ss3_java;

import java.util.Scanner;

public class CommandLineResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, j = 1;
        int a = i++ + j++; // i = 2, j = 2
        //  a = 1 + 1 = 2

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
/*--------------------------------------------------
        int i = 1, j = 1;
        int a = i++ + ++j; // i = 2, j = 2
        //  a = 1 + 2 = 3

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
        */
    }
}
