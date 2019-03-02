import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int counter = 0; counter < numberInput; counter++)
        {
            int element = Integer.parseInt(scanner.nextLine());
            if (counter % 2 == 0)
                evenSum += element;

            else
                oddSum += element;
        }
        System.out.printf("Even sum = %.0f",evenSum);

        if (oddSum == evenSum) {

            System.out.printf("Yes,Sum = %d", evenSum);

        }
        else {

            int difference = Math.abs(oddSum-evenSum);
            System.out.printf("No, Diff = %d", difference);

        }
    }
}
