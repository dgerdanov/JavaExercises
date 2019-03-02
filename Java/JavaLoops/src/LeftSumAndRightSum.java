import java.util.Scanner;
public class LeftSumAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for (int counter = 0; counter < numberInput; counter++)

        {
            sumLeft = sumLeft + Integer.parseInt(scanner.nextLine());
        }
        for (int counter = 0; counter < numberInput; counter++)
        {
            sumRight = sumRight + Integer.parseInt(scanner.nextLine());
        }
        if (sumLeft == sumRight)
        {

            System.out.printf("Yes, sum = %d " , sumLeft);
        }
        else
        {
            double difference = Math.abs(sumRight - sumLeft);
            System.out.printf("No diff = %.0f", difference);
        }
    }
}
