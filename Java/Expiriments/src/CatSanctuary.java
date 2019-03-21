import java.util.Scanner;

public class CatSanctuary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodBoughtForOneCat = Integer.parseInt(scanner.nextLine());
        int foodInGrams = foodBoughtForOneCat*1000;
        double foodTotal =0;

        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("Adopted")) {


            int foodEaten = Integer.parseInt(command);

            foodTotal +=foodEaten;

            command = scanner.nextLine();
        }
        double diff = Math.abs(foodInGrams -foodBoughtForOneCat);

        if (foodInGrams>=foodTotal) {

            System.out.printf("Food sufficient, left %f grams", diff);

        }
        else{
            System.out.printf("Food not enough ", diff);
        }
    }
}
