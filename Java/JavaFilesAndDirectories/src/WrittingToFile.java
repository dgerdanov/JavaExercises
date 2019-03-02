import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class WrittingToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath ="\\Exercises\\input.txt\\";
        String outputPath ="\\Exercises\\output.txt\\";
        HashSet<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation, ',', '.', '!', '?');

        try (FileInputStream fis = new FileInputStream(inputPath);
             FileOutputStream fos = new FileOutputStream(outputPath)){
            int oneByte = fis.read();
            while (oneByte >= 0) {
                if (!punctuation.contains((char)(oneByte))) {

                }
                oneByte = fis.read();
                fos.write(oneByte);

            }
    }
        catch (IOException e){
            e.printStackTrace();


        }
    }
}
