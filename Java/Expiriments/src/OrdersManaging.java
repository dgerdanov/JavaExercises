import java.util.Scanner;

public class OrdersManaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        calculatePrice(product, quantity);
    }

    private static void calculatePrice(String product, double quantity) {

        // price  per  unit

        double coffeePrice = 1.50;
        double waterPrice = 1.00;
        double cokePrice = 1.40;
        double snacksPrice = 2.00;

        // total price

        double coffeeTotalPrice = coffeePrice * quantity;
        double waterTotalPrice = waterPrice * quantity;
        double cokeTotalPrice = cokePrice * quantity;
        double snacksTotalPrice = snacksPrice * quantity;


        if (product.equalsIgnoreCase("coffee")) {

            System.out.printf("%.5f",coffeeTotalPrice);

        }
        else if (product.equalsIgnoreCase("water")) {

            System.out.println(waterTotalPrice);

        }

    }
}