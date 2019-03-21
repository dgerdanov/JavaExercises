import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linesCounter = Integer.parseInt(scanner.nextLine());
        int[] arrFirst = new int[linesCounter];
        int[] arrSecond = new int[linesCounter];

        for (int i = 0; i < linesCounter; i++) {

            String[] numbers = scanner.nextLine().split(" ");

            if (i % 2 == 0) {

                arrFirst[i] = Integer.parseInt(numbers[0]);
                arrSecond[i] = Integer.parseInt(numbers[1]);

            } else {

                arrFirst[i] = Integer.parseInt(numbers[1]);
                arrSecond[i] = Integer.parseInt(numbers[0]);

            }


        }
        for (int number : arrFirst) {
            System.out.print(number + " ");

        }

        System.out.println();

        for (int number : arrSecond) {
            System.out.print(number + " ");

        }
        
    }
}
