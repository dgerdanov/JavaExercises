package streamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class FindingAndSummingIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        Optional<Integer> sum = Arrays.stream(input)
                .filter(x -> isNumber(x))
                .map(Integer::valueOf)
                .reduce((x, y) -> x + y);

        if (sum.isPresent())
            System.out.println(sum.get());
        else
            System.out.println("No match");
    }

    public static boolean isNumber(String element) {
        try {
            Integer num = Integer.valueOf(element);
        } catch (NumberFormatException error) {
            return false;
        }
        return true;
    }
}
