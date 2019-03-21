import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        for (int i = 0; i <numbers.length ; i++) {

            int rotations = Integer.parseInt(scanner.nextLine());
            rotations = rotations % numbers.length;
            String firstElement = numbers[0];

            for (int j = 0; j < numbers.length ; j++) {

                numbers[j] = numbers[j + 1];

                
            }
            numbers [numbers.length-1] = firstElement;

            for (String number : numbers) {
                System.out.print(number + " ");
                
            }
            System.out.println();
            
        }
    }
}
