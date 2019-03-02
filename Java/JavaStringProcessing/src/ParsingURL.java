import java.util.Scanner;

public class ParsingURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] url = scanner.nextLine().split("://");

        if (url.length !=2) {
            System.out.println("Invalid URL");
            return;

        }
        String protocol = url[0];
        String server = url[1].substring(0, url[1].indexOf("/"));
        String resources = url[1].substring(url[1].indexOf("/")+ 1 );
        System.out.printf("Protocol= %s",protocol);
        System.out.printf("Server= %s",server);
        System.out.printf("Resources= %s",resources);


//        String[] serverAndResources = url.substring(url.indexOf(":")+2).split("\\\\");
//        String server = serverAndResources[0];
//        String recources = "";
//        for (int i = 0; i <serverAndResources.length ; i++) {
//
//        }
    }
}

