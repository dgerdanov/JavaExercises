import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class ReadingFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathtoFile = "E:\\Exercises\\input.txt\\";

        try (FileInputStream fileStream = new FileInputStream(pathtoFile)) {

            int oneByte = fileStream.read();
            while (oneByte >=0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileStream.read();
                fileStream.close();

            }


        }
        catch (IOException e){

            e.printStackTrace();
        }

    }
}
