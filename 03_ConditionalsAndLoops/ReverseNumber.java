import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number => ");
        int num = sc.nextInt();
        int copy = num;
        int reversedNum = 0; 

        while (copy > 0) {
                int digit = copy %10;
                reversedNum*=10;
                reversedNum+=digit;
                copy/=10;
        }

        System.out.println(reversedNum);

        sc.close();
    }    
}
