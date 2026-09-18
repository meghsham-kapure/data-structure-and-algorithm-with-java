package LinerSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 87, 34 },
                { 56, 9 },
                { 73, 41, 98, 25 },
                { 6, 64 },
                { 31, 82, 17, 45, 70 }
        };

        int target = 401;

        System.out.println(Arrays.toString(searchIn2DArray(arr, target)));
    }

    public static int[] searchIn2DArray(int arr[][], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}