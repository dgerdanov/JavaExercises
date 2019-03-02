import java.util.Scanner;
import java.util.Arrays;
public class ReversedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int arrOfNumbers[] = new int[numbers];

        for (int i = 0; i <arrOfNumbers.length ; i++) {

          arrOfNumbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numbers -1; i >=0 ; i--) {

            System.out.print(arrOfNumbers[i] + " ");
            System.out.println();
            
        }


    }
}
