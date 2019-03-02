import java.io.*;
import java.util.Scanner;


public class BufferedStream {
    public static void main(String[] args) {

        String inputPath ="\\Exercises\\input.txt\\";
        String outputPath ="\\Exercises\\output.txt\\";


        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        PrintWriter writer = new PrintWriter(outputPath))

             {
                 String line = reader.readLine();
                 int counter = 1 ;
            while (line !=null) {
                if (counter % 3 == 0) {
                    writer.println(line);

                }


            }

        }
        catch (IOException e){
            e.printStackTrace();


        }
    }
}



