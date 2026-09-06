import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        CalculatorApp();
    }

    public static void CalculatorApp() {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        System.out.print("\nEnter number 1 :");
        result = sc.nextInt();

        while (true) {
            System.out.println("\nEnter operation choice: ");
            System.out.println(" + for Addition");
            System.out.println(" - for Subtraction");
            System.out.println(" * for Multiplication");
            System.out.println(" / for Division");
            System.out.println(" % for Modulo");

            System.out.print("\nEnter operation : ");
            char operation = sc.next().trim().charAt(0);

            System.out.print("\nEnter number 2 : ");
            int num2 = sc.nextInt();

            switch (operation) {
                case '+':
                    result += num2;
                    break;
                case '-':
                    result -= num2;

                    break;
                case '*':
                    result *= num2;

                    break;
                case '/':
                    result /= num2;

                    break;
                case '%':
                    result %= num2;

                    break;

                default:
                    break;
            }

            System.out.println("\nResult is " + result);

            System.out.print("\nEnter y to continue...  ");
            char continued = sc.next().trim().toLowerCase().charAt(0);

            if (continued != 'y')
                break;
        }


        sc.close();
    }
}
