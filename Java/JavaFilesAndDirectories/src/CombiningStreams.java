import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CombiningStreams {
        public static void main(String[] args) {

            String inputPath ="\\Exercises\\input.txt\\";
            String outputPath ="\\Exercises\\output.txt\\";


            try (Scanner scanner = new Scanner(new FileInputStream(inputPath));
                 PrintWriter writer = new PrintWriter(outputPath)){
                while (scanner.hasNext()) {
                    if (scanner.hasNextInt()) {
                        writer.println(scanner.nextInt());

                    }
                    scanner.next();

                }

            }
            catch (IOException e){
                e.printStackTrace();


            }
        }
    }



