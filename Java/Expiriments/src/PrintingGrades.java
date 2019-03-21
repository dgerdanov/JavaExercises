import java.util.Scanner;

public class PrintingGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradeInNumber = Double.parseDouble(scanner.nextLine());
        printGradeInWords(gradeInNumber);
    }

    private static void printGradeInWords(double gradeInNumber) {

        if (gradeInNumber <= 2.00 && gradeInNumber >= 2.99) {

            System.out.println("Fail");

        }
        else if (gradeInNumber <= 3.00 && gradeInNumber >= 3.49) {

            System.out.println("Poor");

        }
        else if (gradeInNumber <= 4.00 && gradeInNumber >= 4.49) {

            System.out.println("Good");

        }
       else  if (gradeInNumber <= 5.00 && gradeInNumber >= 5.49) {

            System.out.println("Very good");

        }
        else if (gradeInNumber >=5.50){

            System.out.println("Excellent");

        }
    }
}
