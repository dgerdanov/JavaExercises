import java.util.Scanner;

public class CakePiecesCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());
        double wholeCake = cakeLength * cakeLength;


        while (wholeCake >= 0) {
            String taken = scanner.nextLine();
            if (taken.equalsIgnoreCase("STOP")) {
                System.out.printf("%f pieces are left.", wholeCake);
                return;
            }
            wholeCake = wholeCake - Integer.parseInt(taken);
        }

        System.out.printf("No more cake left! You need %f pieces more.", Math.abs(wholeCake));
    }
}




