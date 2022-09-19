package day2022_09_18;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" lütfen bir harf giriniz");
        char grade = scan.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("mükemmel geçtiniz");
                break;
            case 'B':
                System.out.println("COK GÜZEL geçtiniz");
                break;
            case 'C':
                System.out.println("fenba değil  geçtiniz");
                break;
            default:
                System.out.println("gecersiz giriş yaptınız");
        }
    }

}
