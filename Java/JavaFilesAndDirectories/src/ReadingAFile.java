import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "\\Exercises\\input.txt\\";

        try(FileInputStream fis = new FileInputStream(path)) {

            int oneByte = fis.read();
            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte)+ " ");
                oneByte = fis.read();

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());


        }

    }

}

