import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrFirst = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] arrSecond = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int index = 1;
        int sum = 0;
        for (int i = 0; i < arrFirst.length ; i++) {
            if (arrFirst[i] != arrSecond[i]) {
                index = i;
                System.out.println("Not Equal");
                break;
            }
            sum += arrFirst[i];
            
        }
        if (index == -1) {



            System.out.printf("Equal %d", sum);
        }
        else {
            index++;
            System.out.printf("Arrays are not equal.Found difference at %d", index);
        }
    }
}
