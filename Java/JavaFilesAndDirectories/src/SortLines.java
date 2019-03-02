import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) {

        final String inputPath = "\\Exercises\\input.txt";
        final String outputPath = "\\Exercises\\output.txt";

        Path pathIn = Paths.get (inputPath);
        Path pathOut = Paths.get (outputPath);
        try {
            List<String> lines = Files.readAllLines(pathIn);
            Files.readAllLines(pathOut);
            Collections.sort(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
