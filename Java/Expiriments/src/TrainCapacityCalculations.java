import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainCapacityCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();
        while (! line.equals("end")) {
            String[] spaces = line.split(" ");
            if (spaces [0].equals("Add")) {
                int newWagon = Integer.parseInt(spaces[1]);
                wagons.add(newWagon);

            }
            else{
                int passengers = Integer.parseInt(spaces[0]);
               wagons.stream().filter(w_->maxCapacity - w_ >= passengers)
                        .findFirst()
                        .ifPresent(freeWagon ->{
                            int indexOffreeWagon = wagons.indexOf(freeWagon);
                            wagons.set(indexOffreeWagon, freeWagon + passengers );
                        });

            }
            line = scanner.nextLine();


        }
        wagons.forEach(w -> System.out.print(w + " "));
    }
}
