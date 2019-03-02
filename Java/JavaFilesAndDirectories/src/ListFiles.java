import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        final String stringPath ="\\Exercises\\...\\Files-and-Streams\\";
        File file = new File(stringPath);

        if (file.isDirectory()) {

            File[]files = file.listFiles();

            for (File f : files) {
                if (!f.isDirectory()) {
                    System.out.printf("%s:%s", f.getName(), f.length());

                }
                
            }

        }
    }
}
