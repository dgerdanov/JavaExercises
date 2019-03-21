import java.util.Arrays;
import java.util.Scanner;

public class ComparingCommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrFirst = scanner.nextLine().split(" ");
        String[] arrSecond = scanner.nextLine().split(" ");

        for (int i = 0; i < arrSecond.length; i++) {
            for (int j = 0; j < arrFirst.length; j++) {
                if (arrSecond[i].equals(arrFirst[j])) {

                    System.out.print(arrSecond[i]+ " ");
                    break;

                }

            }
        }

    }
}
