import java.util.Arrays;

class Loader {
    public static void main(String[] args) {
        int value = add (3, 4);
        int result = add(value, 10);
        System.out.println(result);
        System.out.println(result);
        System.out.println(result);
        System.out.println(result);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;

    }
}
