public class Count {
    static int DIVIDER = 10;

    static int number(int x) {
        int result = 0;
        while (x >= 1) {
            int a = x % DIVIDER;
            result += a;
            x = x / 10;
        }
        return result;
    }

}
