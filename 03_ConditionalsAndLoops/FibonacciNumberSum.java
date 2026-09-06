import java.util.Scanner;

public class FibonacciNumberSum {

public static void main(String[] args) {
    printFibonacciTillNumber();
    printFibonacciTillNIterations();
}    
public static void printFibonacciTillNumber() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number  => ");

        int num = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int sum = -1;
        System.out.print(n1 + ", " + n2);

        while (true) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            if(sum>num) break;
            System.out.print(", " + sum);
        } 

        System.out.print("\n");

        sc.close();

    }

    public static void printFibonacciTillNIterations() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number  => ");
        int num = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int sum = -1;
        System.out.print(n1 + ", " + n2);

        for (int i = 2; i < num; i++) {
            sum = n1 + n2;
            System.out.print(", " + sum);
            n1 = n2;
            n2 = sum;
        }

        System.out.print("\n");

        sc.close();
    }
}
