package LinerSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 9, 4, 8, 3, 6, 5, 10 };

        int startRange = 4;
        int endRange = 9;

        int target = 5;

        int result = searchInRange(arr, target, startRange, endRange);

        if (result != -1) {
            System.out.println(target + " Found on index " + result);
        } else {
            System.out.println(target + " Found Not ");
        }

        System.out.println();

    }

    public static int searchInRange(int[] arr, int target, int startRange, int endRange) {
        if (startRange >= arr.length && endRange >= arr.length) {
            System.out.println("Invalid range");
            return -1;
        }

        for (int i = startRange; i < endRange; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
