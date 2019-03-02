import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<?> list;

        List<String> numbers = new ArrayList<>(){{add(null); add("6464646 "); add(null);}};

        for (Object o  : numbers) {
            System.out.println(o);
            
        }
    }
}
