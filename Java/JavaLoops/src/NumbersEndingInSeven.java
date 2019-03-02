import java.util.Scanner;
public class NumbersEndingInSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int counter = 1; counter <=1000 ; counter++) {

            if (counter %10 == 7) {

                System.out.println(counter);

            }

        }
    }
}
