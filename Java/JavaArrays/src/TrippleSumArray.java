import java.util.Scanner;
import java.util.Arrays;

public class TrippleSumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] arrNumbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isThereMatch = false;
        for (int i = 0; i <arrNumbers.length ; i++) {
            for (int j = i+1; j <arrNumbers.length ; j++) {
                int sum = arrNumbers[i] + arrNumbers[j];

                boolean hasFound = contains(sum,arrNumbers);
                if (hasFound == true) {
                    System.out.printf("%d + %d == %d%n",arrNumbers[i],arrNumbers[j], sum);
                    isThereMatch = true;
                }
                
            }
            
        }
        if (isThereMatch == false) {
            System.out.println("No Match");
        }
    }

    private static boolean contains(int sum, int[] arrNumbers) {
        for (int arrNumber : arrNumbers) {
            if (arrNumber == sum) {
                return true;

            }
            
        }
        return false;
    }
}