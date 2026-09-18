package LinerSearch;

import java.util.Arrays;

// Find the value in give array

class ArrayLinerSearch {
    public static void main(String[] args) {
        int arr[] = { 18, 12, 9, 14, 77, 50 };

        int target1 = 9;
        int target2 = 90;

        int result1 = linearSearch(arr, target1);

        if (result1 != -1) {
            System.out
                    .println("Found " + target1 + " on index " + result1 + " Element in array " + Arrays.toString(arr));
        } else {
            System.out.println("Found Not " + target1 + " Element in array " + Arrays.toString(arr));
        }

        boolean result2 = linearSearchEnhancedFor(arr, target2);

        if (result2) {
            System.out.println("Found " + target2 + " Element in array " + Arrays.toString(arr));
        } else {
            System.out.println("Found Not " + target2 + " Element in array " + Arrays.toString(arr));
        }

    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static boolean linearSearchEnhancedFor(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }

        return false;
    }
}