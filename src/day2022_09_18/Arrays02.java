package day2022_09_18;

public class Arrays02 {
    public static void main(String[] args) {
        double[] mylist = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = mylist[0];
        for (double number : mylist) {
            if (max < number)
                max = number;
            total += number;
            System.out.println(number);
        }
        System.out.println("sayılar toplamı :" + total);
        System.out.println("en büyük sayi :" + max);

    }
}
