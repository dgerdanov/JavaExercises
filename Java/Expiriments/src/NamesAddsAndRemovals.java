import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NamesAddsAndRemovals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
List <Integer> numbers =
        Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"end".equals(line)) {
            String [] spaces = line.split(" ");
            String command = spaces [0];

            switch(command){

                case "Contains" :
                    int element = Integer.parseInt(spaces[1]);

                    if (numbers.contains(element)) {

                        System.out.println("Yes");


                    }
                    else{

                        System.out.println("No such number");

                    }
                    break;

                case "Print" :

                    String parity = spaces[1];
                    if ("even".equals(parity)) {
                        numbers.stream().filter(n -> n % 2 ==0)
                       .forEach(e -> System.out.print( e + " "));

                    }
                    else{
                        numbers.stream().filter(n -> n % 2 == 1)
                                .forEach(e -> System.out.print( e + " "));
                    }

                    break;

                case "Get" :
                   numbers.stream().reduce((e1, e2)-> e1+e2).ifPresent(System.out::print);
                    break;

                case "Filter" :
                    String condition = spaces[1];
                    int number = Integer.parseInt(spaces[2]);
                    if ("<".equals(condition)) {
                        numbers.stream().filter(e-> e < number);

                    }
                    else if (">".equals(condition)) {
                        numbers.stream().filter(e-> e > number);

                    }
                    break;

                default:
                    break;
            }
            System.out.println();

            line = scanner.nextLine();

        }

    }
}
