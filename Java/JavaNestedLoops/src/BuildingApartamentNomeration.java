import java.util.Scanner;
public class BuildingApartamentNomeration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int counterOfFloors = floors; counterOfFloors >=1 ; counterOfFloors--) {

            for (int counterOfRooms = 0; counterOfRooms < rooms ; counterOfRooms++) {

                if (counterOfFloors == floors) {

                    System.out.printf("L%d%d ", counterOfFloors,counterOfRooms);


                }
                else if (counterOfFloors % 2 == 0) {

                    System.out.printf("O%d%d ", counterOfFloors,counterOfRooms);

                }
                else {
                    System.out.printf("A%d%d ", counterOfFloors,counterOfRooms);
                }
                
            }
            System.out.println();
            
        }
    }
}
