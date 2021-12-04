import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        int number = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        number = scanner.nextInt();
        printNumbers(number);
    }

    public static void printNumbers(int number) {
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Incorrect number");
        }
    }
}
