public class PrimeNumber {
    public static void main(String[] args) {

        printPrimeRange(11, 30);

    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void printPrimeRange(int startNumber, int endNumber) {
        if (startNumber <= endNumber) {
            System.out.print("Prime numbers between " + startNumber + " and " + endNumber + ": ");
            for (int i = startNumber; i <= endNumber; i++) {
                if (isPrime(i)) {
                    if (i != startNumber) {
                        System.out.print(", ");
                    }

                    System.out.print(i);
                }
            }
            System.out.println();
        }else{
            System.out.println("Invalid range " + startNumber + " - " + endNumber);
        }
    }

}
