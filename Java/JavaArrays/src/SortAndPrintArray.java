import java.util.*;

public class SortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        String names[] = new String[numberInput];

        for (int index = 0; index < names.length; index++) {

            names[index] = scanner.nextLine();

        }
        int[] encodedArr = encodeArray(names);

        Arrays.sort(encodedArr);
        printArray(encodedArr);

    }

    private static int[] encodeArray(String[] names) {
        int[] encodedArray = new int[names.length];
        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (int index = 0; index < names.length; index++) {
            int sumOfCharacters = 0;
            for (int indexOfCharacters = 0; indexOfCharacters < names[index].length(); indexOfCharacters++) {
                if (vowels.contains(names[index].charAt(indexOfCharacters))) {

                    sumOfCharacters += (int) (names[index].charAt(indexOfCharacters)) * names[index].length();
                } else {

                    sumOfCharacters += (int) (names[index].charAt(indexOfCharacters)) / names[index].length();
                }

            }
            sumOfCharacters = encodedArray[index];

        }
        return encodedArray;


    }

    private static void printArray(int[] names) {
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}


