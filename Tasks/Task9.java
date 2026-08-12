package Tasks;

import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 5;

        System.out.println("--- Math Operations with Static Import ---");
        System.out.println("Values used: x = " + x + ", y = " + y + "\n");

        System.out.println("Addition Result: " + add(x, y));
        System.out.println("Subtraction Result: " + subtract(x, y));
        System.out.println("Multiplication Result: " + multiply(x, y));
        System.out.println("Division (Floor) Result: " + divide(x, y));
    }
}
