import java.util.Scanner;

public class CalulatingRectangleAreaWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        
     ;
        System.out.println(calculateRectangleArea(a,b));
    }

    private static double calculateRectangleArea(double a, double b) {
        return a * b;
    }
}
