package LinerSearch;

public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        int arr[] = { 301, 8002, 107, 400005, 77480, 60152, 11 };

        System.out.println("Numbers with even number of digit is : " + countEvenDigitNumbers(arr));
    }

    public static int countEvenDigitNumbers(int nums[]) {

        int evenDigitNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = getDigitCount(nums[i]);

            if (digits % 2 == 0) {
                evenDigitNumbers++;
            }
        }

        return evenDigitNumbers;
    }

    public static int countDigits(int number) {
        int digits = 0;

        while (number > 0) {

            digits++;
            number = number / 10;
        }

        return digits;
    }

    public static int getDigitCount(int number) {
        return (int) (Math.log10(number) + 1);
    }
}
