import com.sun.source.tree.IfTree;

import java.util.Scanner;
public class HistogramCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int counter = 0; counter < numbersCount ; counter++) {

            int currentNumberInput = Integer.parseInt(scanner.nextLine());

            if (currentNumberInput < 200) {

                p1++;

            }
            if (currentNumberInput >= 200 && currentNumberInput < 399) {

                p2++;

            }
            if (currentNumberInput >= 400 && currentNumberInput < 599) {

                p3++;

            }
            if (currentNumberInput >= 600 && currentNumberInput < 799) {

                p4++;

            }
            if (currentNumberInput >= 800 ) {

                p5++;

            }
            
        }

        double p1Percentage = p1/numbersCount * 100;
        double p2Percentage = p2/numbersCount * 100;
        double p3Percentage = p3/numbersCount * 100;
        double p4Percentage = p4/numbersCount * 100;
        double p5Percentage = p5/numbersCount * 100;

        System.out.printf("%.2f%%%n",p1Percentage );
        System.out.printf("%.2f%%%n",p2Percentage);
        System.out.printf("%.2f%%%n",p3Percentage);
        System.out.printf("%.2f%%%n",p4Percentage);
        System.out.printf("%.2f%%%n",p5Percentage);



    }
}
