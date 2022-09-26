package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dosya.txt"));
        String line= null;
        while((line =reader.readLine())!=null){
        System.out.println(line);}
    }
}
