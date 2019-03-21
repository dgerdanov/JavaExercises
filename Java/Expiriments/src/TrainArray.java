import java.util.Scanner;
public class TrainArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int[] arrOfWagons = new int[numberOfWagons];

        int sumOfPeople = 0;
        for (int i = 0; i <numberOfWagons ; i++) {

            arrOfWagons[i]=Integer.parseInt(scanner.nextLine());
            sumOfPeople+=arrOfWagons[i];

        }
        for (int arrOfWagon : arrOfWagons) {
            System.out.print(arrOfWagon + " ");
            
        }
        System.out.println();
        System.out.println(sumOfPeople);
    }
}
