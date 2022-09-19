package day2022_09_18;

import java.util.Scanner;

public class MiniProje3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int number = scan.nextInt();
        int bölümlerToplami =0;
        for (int i = 1; i <=number ; i++) {
           if (number%i==0){
               bölümlerToplami+=i;
           }
        }
        if(bölümlerToplami==number*2){
            System.out.println(" mükemmel sayi");
        }else System.out.println("mükemmel sayi değildir");


    }
}
