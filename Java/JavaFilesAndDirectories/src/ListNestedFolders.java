import java.io.File;
import java.util.ArrayDeque;

public class ListNestedFolders {
    public static void main(String[] args) {

        final String stringPath = "\\...\\Files-and-Streams";
        File file = new File(stringPath);
        ArrayDeque <File> queue = new ArrayDeque<>();
        queue.offer(file);
        int counter = 1;
        while (! queue.isEmpty()) {
            File currentDir = queue.poll();
            File [] nestedDirs = currentDir.listFiles();
            for (File nestedDir : nestedDirs) {
                if (nestedDir.isDirectory()) {
                    queue.offer(nestedDir);
                    counter++;

                }
                
            }
            System.out.println(currentDir.getName());

        }
        System.out.println(counter);
    }
}
