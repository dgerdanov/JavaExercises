import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degreesFarenheit = Double.parseDouble(scanner.nextLine());
        double degreesCelcius = FarenheitToCelcius(degreesFarenheit);
        System.out.printf("%.2f",degreesCelcius );
    }

    public static double FarenheitToCelcius(double degreesFarenheit) {
        return (degreesFarenheit - 32) * 5 / 9;
    }
}
