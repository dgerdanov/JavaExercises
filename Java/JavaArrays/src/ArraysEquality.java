import java.util.Scanner;
import java.util.Arrays;
public class ArraysEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputArrOne = scanner.nextLine();
        String inputArrTwo = scanner.nextLine();

        String [] inputOne = inputArrOne.split(" ");
        String [] inputTwo = inputArrTwo.split(" ");

        int[] arrOne = new int [inputArrOne.length()];
        for (int index = 0; index < inputOne.length; index++)
        {
            arrOne[index] = Integer.parseInt(inputOne[index]);
        }

        int[] arrTwo = new int [inputArrTwo.length()];
        for (int index = 0; index < inputTwo.length; index++)
        {
            arrTwo[index] = Integer.parseInt(inputTwo[index]);
        }

        int equalElementsCounter =0;
        if (arrOne.length != arrTwo.length)
        {
            System.out.println("Not equal");
        }
        else{
            for (int i = 0; i < arrOne.length; i++)
            {
                if (arrOne[i] == arrTwo[i])
                {
                    equalElementsCounter++;
                }
            }
            if (equalElementsCounter == arrOne.length) {

                System.out.println("Equal");

            }
            else {

                System.out.println("Not equal");
            }


        }

    }
}
