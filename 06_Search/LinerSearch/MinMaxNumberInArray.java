package LinerSearch;

public class MinMaxNumberInArray {
    public static void main(String[] args) {

        int[] arr = { 7, 2, 9, 4, 1, 8, 3, 6, 5, 10 };

        int[] values = findMinMax(arr);

        System.out.println("Minimum value in the array is " + values[0]);
        System.out.println("Maximum value in the array is " + values[1]);

    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[] { min, max };
    }

}
