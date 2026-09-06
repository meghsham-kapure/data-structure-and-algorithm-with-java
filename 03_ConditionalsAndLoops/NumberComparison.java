import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 => ");
        int num1 = sc.nextInt();

        System.out.print("Enter the number 2 => ");
        int num2 = sc.nextInt();

        System.out.print("Enter the number 3 => ");
        int num3 = sc.nextInt();

        // Approach 1

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number 1 (" + num1 + ") is greatest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number 2 (" + num2 + ") is greatest");
        } else {
            System.out.println("Number 3 (" + num3 + ") is greatest");
        }

        // Approach 2

        int max = -1;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("Number (" + max + ") is greatest");

        // Approach 3

        int maximum = Math.max(num1, num2);
        maximum = Math.max(num3, maximum);
        System.out.println("Number (" + maximum + ") is greatest");

        sc.close();
    }

}
