import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        long sum = 0;
        long number = 0;

        System.out.print("Please enter a number:" + " ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextLong();
        String num = String.valueOf(number);
        armstrong.printNum(number, sum);
        for (int i = 0; i < num.length(); i++) {

            sum += Math.pow(num.charAt(i), num.length());

        }
    }


    public void printNum (long number, long sum) {
        if (sum == number) {
            System.out.println(number + " " + "is an armstrong number");
        } else {
            System.out.print(number + " " + "is not an armstrong number");
        }
    }
}
