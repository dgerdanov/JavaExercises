import java.util.Scanner;
public class NumberSequencePlus3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        for (int counter = 1; counter <=numberInput ; counter+=3) {
            System.out.println(counter);

        }
    }
}
