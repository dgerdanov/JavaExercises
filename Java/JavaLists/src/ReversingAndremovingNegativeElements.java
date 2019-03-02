import java.util.*;
import java.util.stream.Collectors;

public class ReversingAndremovingNegativeElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  inputNumbers = scanner.nextLine();

        List<Integer> listOfNumbers = Arrays.stream(inputNumbers.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < listOfNumbers.size() ; i++) {
            if (listOfNumbers.get(i)<0) {
                listOfNumbers.remove(i--);}
                Collections.reverse(listOfNumbers);


            }
        if (listOfNumbers.size()==0){
            System.out.println("empty");

        }
        else {
            System.out.println(listOfNumbers.toString().replaceAll("[\\[\\],]",""));
        }
            
        }

    }

