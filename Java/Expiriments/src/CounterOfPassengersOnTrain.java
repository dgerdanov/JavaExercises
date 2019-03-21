import java.util.Scanner;

public class CounterOfPassengersOnTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int [] numberOfPassengers = new int[numberOfWagons];
        int sumOfPassengers = 0;

        for (int i = 0; i < numberOfWagons ; i++) {
           numberOfPassengers[i] = Integer.parseInt(scanner.nextLine());
           sumOfPassengers += numberOfPassengers[i];

        }
        for (int numberOfPassenger : numberOfPassengers) {
            System.out.print(numberOfPassenger + " ");
            
        }
        System.out.println();
        System.out.println(sumOfPassengers);




    }
}
