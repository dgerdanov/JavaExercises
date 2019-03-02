import javax.naming.OperationNotSupportedException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.Consumer;

public class DemoCustomStack {
    public static void main(String[] args) throws OperationNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        String readLine = scanner.nextLine();
        String[] inputTokens = readLine.split("[\\s,]+");
        String command = inputTokens[0];
        CustomStack stack = new CustomStack();

        while (!command.equalsIgnoreCase("end")) {
            switch (command) {
                case "Push":
                    final int[] counter = {0};
                    Integer[] integers = Arrays.stream(inputTokens).filter(e -> {
                        try {
                            Integer.parseInt(e);
                        } catch (NumberFormatException ex) {
                            return false;
                        }

                        return true;
                    })
                            .map(Integer::valueOf)
                            .toArray(Integer[]::new);

                    for (Integer integer : integers) {
                        stack.push(integer);
                    }
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    } catch (OperationNotSupportedException exception) {
                        System.out.printf("No elements%n");
                    }
                    break;
            }

            readLine = scanner.nextLine();
            inputTokens = readLine.split("[\\s,]+");
            command = inputTokens[0];
        }

        stack.forEach(System.out::println);


        stack.forEach(System.out::println);
    }
}

class CustomStack implements Iterable {

    private int currentIndex = 0;
    private Integer[] elements;

    public CustomStack() {
        this.elements = new Integer[10];
    }

    public void push(int element) {
        this.elements[currentIndex++] = element;
    }

    public int pop() throws OperationNotSupportedException {
        try {
            return this.elements[--this.currentIndex];
        } catch (ArrayIndexOutOfBoundsException exception) {
            this.currentIndex++;
            throw new OperationNotSupportedException();
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int innerIndex = currentIndex;

            @Override
            public boolean hasNext() {
                return innerIndex > 0;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    return elements[--innerIndex];
                }

                throw new NoSuchElementException();
            }
        };
    }

    @Override
    public void forEach(Consumer action) {
        if (currentIndex < 0) {
            try {
                throw new OperationNotSupportedException();
            } catch (OperationNotSupportedException e) {
                System.out.printf("No elements%n");
            }
        }
        Iterator<Integer> myIterator = iterator();
        while(myIterator.hasNext()) {
            action.accept(myIterator.next());
        }


    }
}