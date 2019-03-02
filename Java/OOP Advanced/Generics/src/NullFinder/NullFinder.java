import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
public class NullFinder {
    public static Iterable<Integer> getNullIndices(List<?> list) {
        Collection<Integer> nulls = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                nulls.add(i);
            }
        }
        return nulls; }

}
