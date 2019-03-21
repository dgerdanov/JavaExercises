import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemovingNegativesAndReversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(e -> e< 0);
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("Empty");


        }
        else{
            numbers.forEach(e -> System.out.println(e + " "));
        }
        numbers.removeAll( numbers.subList(2, 3));

    }
}
