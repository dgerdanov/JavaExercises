import java.util.Scanner;

public class OddEvenPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = Double.MIN_VALUE;
        double evenMin = Double.MAX_VALUE;
        double evenMax = Double.MIN_VALUE;

        for (int counterOfNumbers = 1; counterOfNumbers <= numberInput; counterOfNumbers++) {

            double currentNumber = Double.parseDouble(scanner.nextLine());

            if (counterOfNumbers % 2 == 0) {

                evenSum += currentNumber;

                if (currentNumber > evenMax) {

                    evenMax = currentNumber;

                }
                if (currentNumber < evenMin) {

                    evenMin = currentNumber;
                }

            } else {

                oddSum += currentNumber;
                if (currentNumber > oddMax) {

                    oddMax = currentNumber;

                }
                if (currentNumber < oddMin) {

                    oddMin = currentNumber;
                }
            }


        }

        if (oddMin == Double.MAX_VALUE)
        {

            System.out.printf("OddMin=No%n");
        }
        else
        {
            System.out.printf("OddMin=%.0f%n", oddMin);
        }
        if (oddMax == Double.MIN_VALUE)
        {

            System.out.printf("OddMax=No%n");
        }
        else
        {
            System.out.printf("OddMax = %.0f%n", oddMax);
        }
        System.out.printf("EvenSum=%.0f%n", evenSum);
        if (evenMin == Double.MAX_VALUE)
        {

            System.out.printf("EvenMin=No%n");
        }
        else
        {
            System.out.printf("EvenMin=%.0f%n", evenMin);
        }
        if (evenMax == Double.MIN_VALUE)
        {

            System.out.printf("EvenMax=No%n");
        }
        else
        {
            System.out.printf("EvenMax=%.0f%n", evenMax);
        }

        System.out.printf("Odd sum = %.0f %n", oddSum);

//
//        System.out.printf("");
    }
}
