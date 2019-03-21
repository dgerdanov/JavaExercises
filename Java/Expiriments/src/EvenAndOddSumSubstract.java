import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSumSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int num : arrOfNumbers) {
            if (num % 2 == 0) {
                evenSum += num;

            } else if (num % 2 != 0){
                oddSum += num;
            }


        }
        int diff = evenSum - oddSum;
        System.out.println(diff);

    }
}
