import java.util.Scanner;

public class Task_2 {

    private static final String EQUALS = "Строки идентичны";
    private static final String NOT_EQUAL = "Строки неидентичны";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if(args.length == 0) args = scanner.nextLine().split(" ");
        System.out.println(args[0].equals(args[1]) ? EQUALS : NOT_EQUAL);
    }
}
