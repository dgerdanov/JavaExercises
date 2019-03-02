package streamAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


    public class TakingTwoElements {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<String> elements= Arrays.asList(scanner.nextLine().split("\\s+"));

            List<Integer> numbers = new ArrayList<>();
            for (String element : elements) {
                numbers.add(Integer.parseInt(element));
            }

            numbers.stream()
                    .filter(n -> 10 <= n && n <= 20)
                    .distinct()
                    .limit(2)
                    .forEach(n -> System.out.print(n + " "));
        }
    }


