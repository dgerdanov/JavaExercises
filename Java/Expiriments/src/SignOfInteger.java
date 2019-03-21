import java.util.Scanner;
public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printSign(Integer.parseInt(scanner.nextLine()));
    }

    public static void printSign(int numberInput) {
        if (numberInput < 0) {

            System.out.printf("The number %d is negative",numberInput);

        }
        if (numberInput > 0) {

            System.out.printf("The number %d is positive",numberInput);

        }
        else{

            System.out.printf("The number %d is 0",numberInput);

        }
    }
}
