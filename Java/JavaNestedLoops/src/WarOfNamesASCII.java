import java.util.Scanner;
public class WarOfNamesASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameInput = scanner.nextLine();
        String nameWinner = "";
        int score = 0;

        while (!"STOP".equals(nameInput)) {

            int temporaryScore = 0;
            for (int counterOfLetters = 0; counterOfLetters <nameInput.length() ; counterOfLetters++) {
                temporaryScore += nameInput.charAt(counterOfLetters);
                
            }
            if (temporaryScore > score) {

                score = temporaryScore;
                nameWinner = nameInput;

            }

            nameInput = scanner.nextLine();

        }

        System.out.printf("Winner is %s - %d!",nameWinner,score);

    }
}
