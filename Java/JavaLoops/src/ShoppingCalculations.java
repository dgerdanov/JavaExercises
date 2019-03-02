import java.util.Scanner;

public class ShoppingCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeededForTrip = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int counterOfDays = 0;
        int counterOfSpendingDays = 0;
        while (moneyNeededForTrip > moneyAvailable) {

            String action = scanner.nextLine();
            double moneySavedOrSpent = Double.parseDouble(scanner.nextLine());
            if (action.equalsIgnoreCase("save")) {


                moneyAvailable += moneySavedOrSpent;
            } else if (action.equalsIgnoreCase("spend")) {

                moneyAvailable -= moneySavedOrSpent;
                counterOfSpendingDays++;
                if (counterOfSpendingDays >= 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(counterOfSpendingDays);
                    break;


                }

            } else if (moneyAvailable < 0) {
                moneyAvailable = 0;
                break;


            }



            counterOfDays ++;
        }
        if (moneyAvailable == moneyNeededForTrip) {

            System.out.printf("You saved the money for %d days.", counterOfDays);
           return;


        }

    }
}
