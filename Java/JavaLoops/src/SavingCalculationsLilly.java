import java.util.Scanner;

public class SavingCalculationsLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());
        int counterOfToys = 0;
        int counterOfMoney = 10;
        double sumOfSavedMoney = 0;

        for (int counterOfAges = 1; counterOfAges <= age; counterOfAges++) {
            if (counterOfAges % 2 == 0) {

                sumOfSavedMoney += counterOfMoney - 1;
                counterOfMoney+=10;

            }
            else {
                counterOfToys++;
            }

        }
        double toysTotalPrice = pricePerToy*counterOfToys;
        sumOfSavedMoney+=toysTotalPrice;

        double difference = sumOfSavedMoney - priceOfWashingMachine;

        if (difference<0) {

            System.out.printf("No! %.2f", Math.abs(difference));

        }
        else {

            System.out.printf("Yes! %.2f", Math.abs(difference));

        }
    }
}
