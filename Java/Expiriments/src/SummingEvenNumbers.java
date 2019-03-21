import java.util.Arrays;
import java.util.Scanner;

public class SummingEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int sumOfNumbers = 0;
        for (int i = 0; i < arrOfNumbers.length ; i++) {
            if (arrOfNumbers[i] % 2==0) {
                sumOfNumbers += arrOfNumbers[i];

            }

            
        }
        System.out.println(sumOfNumbers);

    }
}
