
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Please enter a number:" + " ");
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        String num = String.valueOf(number);
        long sum = 0;
        printNum(number,sum);
        for (int i = 0; i < num.length(); i++) {

            sum += Math.pow(num.charAt(i), num.length());

        }
    }

    public static void printNum(long number, long sum) {
        if (sum == number) {
            System.out.print(number + " " + "is an armstrong number");
        } else {
            System.out.print(number + " " + "is not an armstrong number");
        }
    }
}