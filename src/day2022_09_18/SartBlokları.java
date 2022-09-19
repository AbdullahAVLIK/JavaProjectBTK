package day2022_09_18;

public class SartBlokları {
    public static void main(String[] args) {
        int sayi1 = 27,sayi2 =28, sayi3 = 26;
        int enBüyükSayi = sayi1 > sayi2 ? sayi1 : sayi2;
        int enBüyükSayi2 = enBüyükSayi>sayi3? enBüyükSayi: sayi3;
        System.out.println("enBüyükSayi = "+ enBüyükSayi2);

    }
}
