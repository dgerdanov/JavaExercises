import java.util.Scanner;
import java.util.Arrays;
public class ArrayElementsPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arrTwentyElements = new int [20];



        for (int index = 0; index < arrTwentyElements.length ; index++) {


            arrTwentyElements[index] = index*5;



        }

        System.out.println(Arrays.toString(arrTwentyElements));

    }

}
