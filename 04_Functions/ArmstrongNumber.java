public class ArmstrongNumber {
        public static void main(String[] args) {
            for (int i = 100; i < 1000; i++) {                
                int digitCount =countDigit(i) ;
                boolean isArmstrong = checkValue(i, digitCount) == i ;
                System.out.print(isArmstrong?i+",":"");
            }
        }

        public static int countDigit(int number) {
            int counter=0;
            while (number > 0) {
                number/=10;
                counter++;
            }       
            return counter;
        }

        public static int checkValue(int number, int digitCount) {            
            int sum=0;
             while (number > 0) {
                int digit = number%10;
                int x = (int) Math.pow(digit, digitCount);
                sum+=x;
                number=number/10;
        }
        return sum;
    }
}
