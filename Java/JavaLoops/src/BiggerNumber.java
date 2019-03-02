import java.util.Scanner;
public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int max =Integer.MIN_VALUE;
        for (int counter = 0; counter <=numberInput  ; counter++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber>max) {
                max=currentNumber;

            }



        }
        System.out.println("max = " + max);

    }
}
