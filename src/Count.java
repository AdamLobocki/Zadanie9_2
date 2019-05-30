import java.util.Scanner;


public class Count {
    static int DIVIDER = 10;

    static Scanner scanner = new Scanner(System.in);

    static int number() {
        System.out.println("Podaj liczbę");
        int result = 0;
        int x = scanner.nextInt();
        while (x >= 1) {
            int a = x % DIVIDER;
            result += a;
            x = x / 10;
        }
        return result;
    }

}
