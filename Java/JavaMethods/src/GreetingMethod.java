import java.util.Scanner;
public class GreetingMethod {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String name;
       name = SayHello();
        System.out.printf("Hello %s",name);


    }

    public static String SayHello() {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("Input name");
        name = scanner.nextLine();
        return name;

    }
}
