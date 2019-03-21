import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class SortingProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();
        for (int i = 0; i <numberInput ; i++) {
            products.add(scanner.nextLine());
            Collections.sort(products);
            for (int j = 1; j <numberInput ; j++) {
                System.out.println(i+"."+ products.get(i-1));
                
            }
        }
    }
}
