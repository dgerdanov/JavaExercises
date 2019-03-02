import java.util.Scanner;
public class WholeNumberDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int counter = 0; counter < numbersCount ; counter++) {

            int currentNumberInput = Integer.parseInt(scanner.nextLine());

            if (currentNumberInput % 2 == 0) {

                p1++;

            }
            if (currentNumberInput % 3 == 0) {

                p2++;

            }
            if (currentNumberInput % 4 == 0) {

                p3++;

            }
        }
        double p1Percentage = p1/numbersCount * 100;
        double p2Percentage = p2/numbersCount * 100;
        double p3Percentage = p3/numbersCount * 100;

        System.out.printf("%.2f%%%n",p1Percentage );
        System.out.printf("%.2f%%%n",p2Percentage);
        System.out.printf("%.2f%%%n",p3Percentage);
    }
}
