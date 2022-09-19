package day2022_09_18;

import java.util.Arrays;

public class String01 {
    public static void main(String[] args) {
        String mesaj = "bugun hava cok güzel";
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println("mesaj.lastIndexOf('l') = " + mesaj.lastIndexOf('l'));
        for (String each : mesaj.split( "")) {
            System.out.print(each+" ");
        }
        System.out.println("mesaj.toLowerCase() = " + mesaj.toUpperCase());
    }

}
