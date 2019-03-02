import java.util.Scanner;
import java.util.Arrays;

public class EqualStringsCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputArr1 = scanner.nextLine();
        String inputArr2 = scanner.nextLine();

        char[] Arr1 = inputArr1.toCharArray();
        char[] Arr2 = inputArr1.toCharArray();

        int indexArr1 = 0;
        int indexArr2 = 0;

        boolean areTheyEqual = false;

        while (Arr1.length > indexArr1 && Arr2.length > indexArr2) {

            if (Arr1[indexArr1] > Arr2[indexArr2]) {

                System.out.println(inputArr2);
                areTheyEqual = false;
                break;


            } else {
                areTheyEqual = true;
            }
            indexArr1++;
            indexArr2++;
        }

        if (areTheyEqual = true) {

            if (Arr1.length < Arr2.length) {
                System.out.println(inputArr1);
            } else if (Arr1.length > Arr2.length) {

                System.out.println(inputArr2);
            } else {
                System.out.println("No difference");
            }


        }


    }
}

