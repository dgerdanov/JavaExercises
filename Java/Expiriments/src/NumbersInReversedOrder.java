import java.util.Scanner;

public class NumbersInReversedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int [] arrOfNumbers = new int[numberInput];

        for (int i = 0; i < arrOfNumbers.length ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            arrOfNumbers [i] = currentNumber;

        }
        for (int i = arrOfNumbers.length -1; i >=0 ; i--) {
            System.out.println(arrOfNumbers[i]);
            
        }
    }
}
