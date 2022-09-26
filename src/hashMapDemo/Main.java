package hashMapDemo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> degerler = new HashMap<>();
        degerler.put("TOSHİBA",12);
        System.out.println("degerler = " + degerler);

        List<String> list =new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        String[] arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[]{1, 2,};
        List<int[]> list2 =Arrays.asList(arr2);

    }
}
