import java.util.Scanner;

public class GetMaxMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(GetMax(GetMax(firstNumber, secondNumber), thirdNumber));


    }

    public static int GetMax(int firstNumber, int secondNumber) {
        Scanner scanner = new Scanner(System.in);
        if (firstNumber > secondNumber) return firstNumber;
        else {
            return secondNumber;
        }

    }
}
