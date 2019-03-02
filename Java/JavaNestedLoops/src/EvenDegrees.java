import java.util.Scanner;

public class EvenDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;

        for (int counter = 0; counter <= numberInput; counter += 2) {
            System.out.println(currentNumber);
            currentNumber = currentNumber * 2 * 2;

        }
    }
}
