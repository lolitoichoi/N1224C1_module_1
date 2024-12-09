package ss3_java;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

import java.util.Scanner;

public class PhepToan
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Mời bạn nhập a : ");
        int a = in.nextInt();
        System.out.print("Mời bạn nhập b : ");
        int b = in.nextInt();

        System.out.println("Tính tổng giữa hai số a và b : " + (a + b) );
        System.out.println("Tính hiệu giữa hai số a và b : " + (a - b) );
        System.out.println("Tính tích giữa hai số a và b : " + (a * b) );
        System.out.println("Tính thuơng giữa hai số a và b : " + ((double)a / b) );

    }
    // how to.........in java
}
