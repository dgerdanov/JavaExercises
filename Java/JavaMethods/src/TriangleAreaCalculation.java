import java.util.Scanner;
public class TriangleAreaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width =  Double.parseDouble(scanner.nextLine());
        double height =  Double.parseDouble(scanner.nextLine());
        System.out.println(CalculatingArea(width,height));


    }

    public static double CalculatingArea(double width, double  height) {
        Scanner scanner = new Scanner(System.in);

         double area =width * height / 2;
         return area;

    }
}
