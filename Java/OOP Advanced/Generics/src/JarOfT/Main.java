package JarOfT;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> strings = new ArrayList<>();
        Jar<String> jar = new Jar();
        jar.add("text");
        jar.add("text1");
        jar.add("text2");
        System.out.println(jar.remove());
    }
}
