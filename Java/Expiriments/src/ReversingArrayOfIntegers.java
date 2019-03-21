import java.util.Scanner;

public class ReversingArrayOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[numberInput];
        for (int i = 0; i < numberInput; i++) {

            numbers[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int i = numberInput-1; i >=0 ; i--) {
            System.out.print(numbers[i] + " ");
            System.out.println();
            
        }

    }
}
