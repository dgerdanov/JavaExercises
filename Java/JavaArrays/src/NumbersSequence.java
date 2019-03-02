import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

public class NumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        int[] arrNumberSequence = new int[n];
        arrNumberSequence[0] = 1;


        for (int elementSequence = 1; elementSequence < n ; elementSequence++) {
            int result = 0;
            for (int prevElementSequence = elementSequence-1; prevElementSequence >= 0 &&
                    prevElementSequence>= elementSequence -k; prevElementSequence--) {

                result += arrNumberSequence[prevElementSequence];


            }
            arrNumberSequence[elementSequence] = result;
        }
        for (int counter = 0; counter < n ; counter++) {
            System.out.printf("%d ",arrNumberSequence[counter]);

        }

        }

    }

