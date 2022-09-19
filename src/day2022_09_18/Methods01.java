package day2022_09_18;

public class Methods01 {
    public static void main(String[] args) {
    int toplam =   topla(1,2,3,4,5,6,7,8,9);
        System.out.println(toplam);
    }

    private static int topla(int...sayılar) {
        int toplam = 0;
        for (int sayi: sayılar) {
            toplam+=sayi;

        }
        return toplam;
    }
}
