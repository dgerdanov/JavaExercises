import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String readLine = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!readLine.equalsIgnoreCase("end")) {
            String[] inputTokens = readLine.split("[\\s]+");
            String name = inputTokens[0];
            int age = Integer.valueOf(inputTokens[1]);
            String town = inputTokens[2];
            Person person = new Person(name, age, town);

            people.add(person);
            readLine = scanner.nextLine();
        }

        int comparePerson = Integer.valueOf(scanner.nextLine());
        Person personToCompare = people.get(comparePerson - 1);
        people.remove(comparePerson -1);

        int samePeople = 0;
        int differentPeople = 0;
        int totalPeople = people.size() + 1;

        for (Person person : people) {
            if (person.compareTo(personToCompare) == 0) {
                samePeople++;
            } else {
                differentPeople++;
            }
        }

        if (samePeople == 0) {
            System.out.println("No matches");
            return;
        }

        System.out.println(String.format("%d %d %d", ++samePeople, differentPeople, totalPeople));
    }
}

class Person implements Comparable<Person> {
    private String name;

    private int age;

    private String town;

    public Person(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    private void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person personToCheck) {
        if (this.getName().equals(personToCheck.getName())) {
            if (this.getAge() == personToCheck.getAge()) {
                if (this.getTown().equals(personToCheck.getTown())) {
                    return 0;
                }

                return 1;
            }

            return 1;
        }

        return 1;
    }
}
