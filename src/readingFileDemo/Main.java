package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        BufferedReader bufferedReader =null;
        int total=0;
        try {
             bufferedReader = new BufferedReader(new FileReader("src/readingFileDemo/sayilar.txt"));
             String line =null;
             while((line=bufferedReader.readLine())!=null){
                 total+=Integer.valueOf(line);
             }
            System.out.println("Toplam = "+total);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                bufferedReader.close();
            }catch(Exception e){

            }
        }
    }
}

