import java.util.Scanner;
public class MathPower {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       double number = Double.parseDouble(scanner.nextLine());
       double power = Double.parseDouble(scanner.nextLine());

        System.out.println(MathPower(number,power));

    }

    public static double MathPower(double number, double power)
    {
        double result = 1;
        for (int i = 0; i < power; i++)
            result *= number;
        return result;
    }}
