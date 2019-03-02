import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjasentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> listOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < listOfNumbers.size() - 1; i++) {
            double currentNum = listOfNumbers.get(i);
            double nextNum = listOfNumbers.get(i + 1);
            if (currentNum == nextNum) {
                listOfNumbers.set (i, currentNum + nextNum);
                listOfNumbers.remove(i+1);
                i = -1;

            }
            
        }
        for (Double listOfNumber : listOfNumbers) {
            System.out.printf("%.0f ", listOfNumber);
            
        }
        }
    }

