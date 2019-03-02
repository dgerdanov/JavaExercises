package streamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class MinimalEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        Optional<Double> minNum = Arrays.stream(input)
                .filter(x -> !x.isEmpty())
                .map(x -> Double.parseDouble(x))
                .filter(x -> x % 2 == 0)
                .min((x, y) -> Double.compare(x, y));

        if (minNum.isPresent())
            System.out.printf("%.2f",minNum.get());
        else
            System.out.println("No match");
    }
}
