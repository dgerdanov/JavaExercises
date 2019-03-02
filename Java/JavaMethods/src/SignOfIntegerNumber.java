import java.util.Scanner;
public class SignOfIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = Integer.parseInt(scanner.nextLine());
        PrintSignOfNumber(numberInput);



    }

    public static void PrintSignOfNumber( int numberInput) {
        Scanner scanner = new Scanner(System.in);



        if (numberInput <0) {

            System.out.printf("%d Negative",numberInput);

        }
        else if (numberInput == 0) {

            System.out.printf("%d The number is 0",numberInput);

        }
        else if (numberInput > 0){

            System.out.printf(" %d Positive", numberInput);


    }
}}
