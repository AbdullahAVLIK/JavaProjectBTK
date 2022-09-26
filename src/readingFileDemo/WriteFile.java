package readingFileDemo;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        String str = "Bunu dosyaya yazdir";

        File file = new File("dosya.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();


        FileReader fileReader = new FileReader(file);
        String line;
        BufferedReader br = new BufferedReader(fileReader);

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }
}
