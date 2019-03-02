import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class WrittingToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPath="E:\\Exercises\\input.txt\\";
        String outputPath="E:\\Exercises\\output.txt\\";
        List<Character> symbols = new ArrayList<Character>();
        Collections.addAll(symbols, '.', ',', '!', '?');


        try (InputStream in = new FileInputStream((inputPath));
             OutputStream out = new FileOutputStream(outputPath)) {
            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                if (!symbols.contains((char)oneByte)) {
                    out.write(oneByte);
                }
            }
        }
        catch (IOException e){

            e.printStackTrace();
        }
        finally{

        }

    }
}
