package src;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static char[] calc(String input) {
       char[] result = input.toCharArray();
       int res_len = result.length;
        for (int i = 0; i < res_len; i++) {
           System.out.println(result[i]);
        }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(scanner.nextLine()));
    }
}
