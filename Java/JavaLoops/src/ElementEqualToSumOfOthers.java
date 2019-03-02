import java.util.Scanner;

public class ElementEqualToSumOfOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sumOfElements = 0;
        for (int counter = 0; counter < numberInput; counter++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sumOfElements += currentNumber;
            if (currentNumber > maxNum){
                maxNum = currentNumber;
            }
        }

        if (maxNum == sumOfElements - maxNum){
            System.out.println("Yes Sum = " + maxNum);
        }
        else {
            int absDifference = Math.abs(maxNum - (sumOfElements - maxNum));
            System.out.println("No Diff = " + absDifference);
        }
    }
}