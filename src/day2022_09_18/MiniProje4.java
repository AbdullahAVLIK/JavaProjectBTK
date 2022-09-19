package day2022_09_18;

import java.util.Scanner;

public class MiniProje4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println(arkadasSayı(number1, number2));

    }

    private static boolean arkadasSayı(int number1, int number2) {
        int total1 = 0;
        int total2 = 0;
        boolean result =true;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1+=i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2+=i;
            }
        }
        if(!(total1==number2&&total2==number1))
            result =false;

      return result;
    }

}
