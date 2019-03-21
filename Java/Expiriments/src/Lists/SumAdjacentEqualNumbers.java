package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String[] numbers = input.split("\\s+");
            List<Double> doubleList = new ArrayList<>();
            for (String number : numbers) {
                doubleList.add(Double.parseDouble(number));
            }

            for (int i = 0; i < doubleList.size() - 1; i++) {
                double firstNumber = doubleList.get(i);
                double secondNumber  = doubleList.get(i+1);
                if (firstNumber == secondNumber) {
                    double sum = firstNumber + secondNumber;
                    doubleList.set(i, sum);
                    doubleList.remove(i+1);
                    i--;

                }

            }
            System.out.println();


        }
}
