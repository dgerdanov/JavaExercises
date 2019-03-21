import java.util.Arrays;
import java.util.Scanner;
public class SnowmanCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] snowmen = Arrays.stream(scanner.nextLine().split(""))
                .mapToInt(Integer::parseInt).toArray();
        while (snowmen.length > 1) {
            for (int i = 0; i <snowmen.length ; i++) {
                int attackerValue = snowmen[i];
                if (attackerValue == -1) {
                    break;

                }
                int attackerIndex= i;
                int targetIndex = attackerValue % snowmen.length;
                
            }

        }
    }
}
