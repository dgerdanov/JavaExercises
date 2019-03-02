package streamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageSumOFDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");

        OptionalDouble average = Arrays.stream(numbers)
                .filter(x -> !x.isEmpty())
                .mapToDouble(x -> Double.parseDouble(x))
                .average();

        if (average.isPresent()) {
            System.out.printf("%.2f", average.getAsDouble());
        } else {
            System.out.println("No match");
        }
    }
}
