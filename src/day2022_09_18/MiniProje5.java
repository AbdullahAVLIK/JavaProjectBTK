package day2022_09_18;

import java.util.Arrays;

public class MiniProje5 {
    public static void main(String[] args) {

        int[] sayılar = new int[]{1, 2, 5, 7, 9};
        Arrays.sort(sayılar);
        System.out.println(Arrays.binarySearch(sayılar, 6));
        boolean varMı = false;
        int aranan = 3;
        for (int each : sayılar)
            if(each == aranan){
                varMı =true;
            }
        System.out.println(varMı);

    }
}
