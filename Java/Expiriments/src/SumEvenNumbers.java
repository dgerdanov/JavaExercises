import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] stringOfNumbers = input.split("\\s+");
        int arrOfNumbers [] = new int [stringOfNumbers.length];
        for (int i = 0; i < stringOfNumbers.length; i++) {
            arrOfNumbers[i] = Integer.parseInt(stringOfNumbers[i]);
            
        }

        int sum = 0;


        for (int i = 0; i < arrOfNumbers.length ; i++) {
            if (arrOfNumbers [i] % 2 == 0) {
                sum  += arrOfNumbers[i];

            }
            
        }
        System.out.println(sum);
    }
}
