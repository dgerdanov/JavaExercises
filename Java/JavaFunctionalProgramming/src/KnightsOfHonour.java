import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created by Nino Bonev - 6.6.2018 г., 10:25
 */
public class KnightsOfHonour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Consumer<String> consumer = name -> System.out.println("Sir " + name);

        names.forEach(consumer);
    }
}