import java.util. Scanner;

public class Login {
    public static void main(String[] args) {
        String login = "tania";
        String password = "qwerty123";
        boolean isPasswordSuccessful = false;
        boolean isLoginSuccessful = false;


        while (isLoginSuccessful == false) {
            System.out.println("Enter Login");
            Scanner scanner = new Scanner(System.in);
            String currentLogin = scanner.next();


            if (currentLogin.equals(login)) {
                isLoginSuccessful = true;
                System.out.println("Login successful");
            } else {
                System.out.println("Login failed");

            }
        }

        while (isPasswordSuccessful == false) {
            System.out.println("Enter Password");
            Scanner sc = new Scanner(System.in);
            String currentPassword = sc.next();


            if (currentPassword.equals(password)) {
                isPasswordSuccessful = true;
                System.out.println("Password successful");
            } else {
                System.out.println("Password failed");
            }
        }

        System.out.println("1.Even Number");
        System.out.println("2.Armstrong");
        System.out.println("3.Reverse");
        System.out.println("4.Fibonacci");
        System.out.println("5.Replace");

        Scanner pr = new Scanner(System.in);
        System.out.println("Enter number from the task list");
        int taskIndex = pr.nextInt();


        if (taskIndex == 1) {
            System.out.println("1.Even Number");
        } else if (taskIndex == 2) {
            System.out.println("2.Armstrong");
        } else if (taskIndex == 3) {
            System.out.println("3.Reverse");
        } else if (taskIndex == 4) {
            System.out.println("4.Fibonacci");
        } else if (taskIndex == 5) {
            System.out.println("5.Replace");
        }
    }
}