import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        String lastDigit = GetLast(numberInput % 10);
        System.out.println(lastDigit);
    }

    public static String GetLast(int numberInput) {
        if (numberInput < 0) numberInput = -numberInput;

        if (numberInput == 0) {
            return "Zero";
        } else if (numberInput == 1) {
            return "One";
        } else if (numberInput == 2) {
            return "Two";
        } else if (numberInput == 3) {
            return "Three";
        } else if (numberInput == 4) {
            return "Four";
        } else if (numberInput == 5) {
            return "Five";
        } else if (numberInput == 6) {
            return "Six";
        } else if (numberInput == 7) {
            return "Seven";
        } else if (numberInput == 8) {
            return "Eight";
        }
        return "Nine";
    }
}

