import java.util.Scanner;
public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPairs = Integer.parseInt(scanner.nextLine());
        int currentSum = 0;
        double previousSum = 0;
        double difference = 0;
        for (int counter = 1; counter <= numberPairs; counter++)
        {
            if (counter == 1)
            {
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum= Integer.parseInt(scanner.nextLine());
                previousSum = firstNum + secondNum;

            }
            else
            {
                int firstNumSecondPosition = Integer.parseInt(scanner.nextLine());
                int secondNumSecondPosition= Integer.parseInt(scanner.nextLine());
                currentSum = firstNumSecondPosition + secondNumSecondPosition;
                if ((Math.abs(currentSum - previousSum)) > difference)
                {
                    difference = Math.abs(currentSum - previousSum);
                }

                previousSum = currentSum;
            }
        }

        if (difference > 0)
        {
            System.out.printf("No, maxdiff=" + difference);
        }
        else
        {
            System.out.printf("Yes, value=" + previousSum);
        }
    }
}