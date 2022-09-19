package day2022_09_18;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MiniProje2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" lütfen bir sesli harf giriniz");
        char harf = scan.next().toLowerCase(Locale.ROOT).charAt(0);

        switch (harf){
            case 'a','ı','o','u':
                System.out.println("kalın sesli harf");
                break;
            case 'e','i','ö','ü':
                System.out.println( "ince sesli harf");
                break;
            default:
                System.out.println("gecersiz harf girişi");
        }
    }
}
