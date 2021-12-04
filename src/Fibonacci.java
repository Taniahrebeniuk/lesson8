import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long number, x = 0, y = 0, z = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add  numbers");
        number = scanner.nextInt();
        System.out.println("Fibonacci number series: ");
        FibonacciMethod(number, x,y,z);

    }

    public static void FibonacciMethod(long number, long x, long y, long z) {
        for (long i = 0; i <= number; i++) {

            x = y;
            y = z;
            z = x + y;
            System.out.println(x + "");
        }
    }
}
