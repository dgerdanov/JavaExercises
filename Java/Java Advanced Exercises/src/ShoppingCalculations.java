import java.math.BigDecimal;
import java.util.Scanner;
public class ShoppingCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantity = Double.parseDouble(scanner.nextLine());
        double pricePerKg = 1.20;
        BigDecimal priceInLevs = new BigDecimal(pricePerKg * quantity);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal moneyNeeded = exchangeRate.multiply(priceInLevs);
        System.out.printf("%.2f", moneyNeeded);

    }
}
