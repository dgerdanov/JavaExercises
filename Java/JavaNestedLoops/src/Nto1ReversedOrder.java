import java.util.Scanner;
public class Nto1ReversedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        for (int counter = numberInput; counter >=1 ; counter--) {
            System.out.println(counter);

        }
    }
}
