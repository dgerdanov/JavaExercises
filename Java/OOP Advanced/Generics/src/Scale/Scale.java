package Scale;

public class Scale<T extends Comparable <T>> {

    private T left;
    private T right;

    public T getHeavier() {
        if (left.compareTo(right) > 0) {

            return left;

        }
        else if (left.compareTo(right) < 0) {
            return right;

        }

        return null;
    }

    }
