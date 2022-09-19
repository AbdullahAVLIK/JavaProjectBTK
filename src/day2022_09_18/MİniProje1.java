package day2022_09_18;

import java.util.Scanner;

public class MİniProje1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int number = scan.nextInt();
        if (number == 1) {
            System.out.println("sayı asal değildir");
            return;
        }
        if (number < 1) {
            System.out.println("gecersiz sayi");
            return;
        }
        int sayac = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sayac++;
            }
        }
        if (sayac > 2) {
            System.out.println("ASAL SAYI DEĞİLDIR");
        } else System.out.println("ASAL SAYIDIR");


    }
}

