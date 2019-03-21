import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraysEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrOfNumbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] arrOfNumbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int sum = IntStream.of(arrOfNumbers1).sum();


        for (int i = 0; i < arrOfNumbers1.length; i++) {
            if (arrOfNumbers1[i] != arrOfNumbers2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index", i);
                return;
            } else if (arrOfNumbers1[i] == arrOfNumbers2[i]) {



            }

        }
        System.out.println("They are equal");
        System.out.printf("Sum is %d", sum);


    }


}

