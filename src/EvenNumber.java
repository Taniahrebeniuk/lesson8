import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        EvenNumber evenNumber = new EvenNumber();
        System.out.println("Enter number");
        int number = 5;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        evenNumber.printNumbers(number);

    }

    public void printNumbers(int number) {
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Incorrect number");
        }
    }
}
