import java.util.Scanner;
public class Combinations3from10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int number1 = 1; number1 <=8 ; number1++) {
            for (int number2 = 1; number2 <=9 ; number2++) {
                for (int number3 = 1; number2 <=10 ; number3++) {
                    System.out.printf("%d %d %d %n", number1, number2, number3);
                }

            }

        }

    }
}
