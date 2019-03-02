import java.util.Scanner;
public class ReturningChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int counterOfCoins=0;
        double changeInCoins = change*100;

        while (changeInCoins > 0 ) {

            if (changeInCoins >= 200) {
                counterOfCoins++;
                changeInCoins = changeInCoins - 200;

            }
            else if (changeInCoins >= 100) {
                counterOfCoins++;
                changeInCoins = changeInCoins - 100;

            }
            else if (changeInCoins >= 50) {
                counterOfCoins++;
                changeInCoins = changeInCoins - 50;

            }
            else if (changeInCoins >= 20) {
                counterOfCoins++;
                changeInCoins = changeInCoins - 20;

            }
            else if (changeInCoins >= 10) {
                counterOfCoins++;
                changeInCoins = changeInCoins - 10;

            }
            else if (changeInCoins >= 5) {
                counterOfCoins++;
                changeInCoins = changeInCoins - 5;

            }
            else if (changeInCoins >= 2) {
                counterOfCoins++;
                changeInCoins = changeInCoins - 2;

            }
            else if (changeInCoins >= 1) {
                counterOfCoins++;
                changeInCoins = changeInCoins - 1;

            }


        }
        System.out.println(counterOfCoins);

    }
}
