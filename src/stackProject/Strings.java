package stackProject;

public class Strings {
    public static void main(String[] args) {
        String header = "07049182688";
        header = header.startsWith("0")? header.substring(1):header;
        System.out.println(header);

    }
}
