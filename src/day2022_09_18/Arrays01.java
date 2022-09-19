package day2022_09_18;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String ogr1 = " engin";
        String ogr2 = " engin1";
        String ogr3 = " engin2";
        String ogr4 = " engin3";
       /* System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
        System.out.println(ogr4);*/


        String[] ogrenciler = new String[4];
        ogrenciler[0]= "engin";
        ogrenciler[2]= "engin1";
        ogrenciler[1]= "engin2";
        ogrenciler[3]= "engin3";
        Arrays.sort(ogrenciler);
        String[] copyof =Arrays.copyOfRange(ogrenciler,1,3);
        System.out.println(Arrays.toString(copyof));

        System.out.println(Arrays.toString(ogrenciler));
//        for (int i = 0; i < ogrenciler.length ; i++) {
//            System.out.println(ogrenciler[i]);
//        }



    }

    private static void toString(String[] ogrenciler) {
        for (String each: ogrenciler  ) {
            System.out.println(each+ " ");

        }
    }
}
