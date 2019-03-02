import java.util.Scanner;

public class SumOfVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letterInput = scanner.nextLine();
        int sumOfVowels = 0;
        for (int counter = 0; counter < letterInput.length(); counter++) {

            switch (letterInput.charAt(counter)) {
                case 'a':
                    sumOfVowels += 1;
                    break;
                case 'e':
                    sumOfVowels += 2;
                    break;
                case 'i':
                    sumOfVowels += 3;
                    break;
                case 'o':
                    sumOfVowels += 4;
                    break;
                case 'u':
                    sumOfVowels += 5;
                    break;

            }

            System.out.println("Vowels sum = " + sumOfVowels);

        }

    }
}

