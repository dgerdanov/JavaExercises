import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Froggy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String readLine = scanner.nextLine();
        Integer[] collection = Arrays.stream(readLine.split("[\\s,]+"))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);

        Integer[] buffer = new Integer[collection.length];

        for (int i = 0; i < collection.length; i++) {
            buffer[i] = collection[i];
        }

        Lake lake = new Lake(collection);
        Iterator<Integer> iterator = lake.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            buffer[counter++] = iterator.next();
        }

        String result = null;
        result = String.join(", ", (CharSequence[]) Arrays.stream(buffer).map(String::valueOf).toArray(String[]::new));
        while (!readLine.equalsIgnoreCase("end")) {
            readLine = scanner.nextLine();
        }

        System.out.println(result);
    }
}

class Lake implements Iterable<Integer> {

    private Integer[] numbers;

    public Lake(Integer... numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    class Frog implements Iterator<Integer> {

        private int totalCount;
        private int counter;
        private int evenNumbersStartIndex;
        private int oddNumbersStartIndex;

        public Frog() {
            this.totalCount = 0;
            this.evenNumbersStartIndex = 0;
            this.oddNumbersStartIndex = 1;
            this.counter = 0;
        }

        private int getIndex() {
            int limit = numbers.length % 2 == 0 ? numbers.length / 2 - 1: numbers.length /2;
            if (this.counter <= limit) {
                this.counter++;
                this.totalCount++;
                int index = this.evenNumbersStartIndex;
                this.evenNumbersStartIndex+=2;
                return index;
            }

            this.counter++;
            this.totalCount++;
            int index = this.oddNumbersStartIndex;
            this.oddNumbersStartIndex += 2;
            return index;
        }

        @Override
        public boolean hasNext() {
            if (this.totalCount < numbers.length) {
                return true;
            }

            return false;
        }

        @Override
        public Integer next() {
            if (this.hasNext()) {
                return numbers[this.getIndex()];
            }

            throw new NoSuchElementException();
        }
    }
}

