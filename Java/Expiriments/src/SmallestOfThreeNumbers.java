import java.util.Scanner;
public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        findSmallestNumber(4,5,7);


    }



    public static int  findSmallestNumber(int numberOne, int numberTwo, int numberThree ) {
        Scanner scanner = new Scanner(System.in);
        int minNum = Integer.MAX_VALUE;
        if (numberOne < minNum) {
            minNum = numberOne;
        }
        if (numberTwo < minNum) {
            minNum = numberOne;
        }
        if (numberThree < minNum) {
            minNum = numberOne;
        }
        System.out.println(minNum);
        return minNum;


    }

}
