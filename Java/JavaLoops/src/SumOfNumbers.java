import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNumberInput  =0;

        for (int counter = 0; counter <numberInput ; counter++) {

            currentNumberInput  = Integer.parseInt(scanner.nextLine());
            sum += currentNumberInput;


        }
        System.out.println(currentNumberInput);

    }
}
