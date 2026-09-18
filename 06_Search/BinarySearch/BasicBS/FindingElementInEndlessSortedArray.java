// Finding position of element in a sorted array of infinite numbers

public class FindingElementInEndlessSortedArray {

    public static void main(String args[]) {

        int arr[] = new int[] {
            1, 2, 4, 6, 7, 8, 9, 10, 12, 14,
            16, 18, 20, 21, 22, 24, 26, 27, 28, 30,
            32, 34, 35, 36, 38, 40, 42, 44, 45, 46,
            48, 49, 50, 52, 54, 56, 58, 60, 62, 63,
            64, 66, 68, 70, 72, 74, 76, 77, 78, 80,
            81, 82, 84, 86, 88, 90, 91, 92, 94, 96,
            98, 99, 100, 102, 104, 105, 106, 108, 110,
            112, 114, 116, 117, 118, 119, 120, 122, 124,
            126, 128, 130, 132, 133, 134, 135, 136, 138,
            140, 142, 144, 146, 147, 148, 150, 152, 153,
            154, 156, 158, 160, 161, 162, 164, 166, 168,
            170, 171, 172, 174, 175, 176, 178, 180, 182,
            184, 186, 188, 189, 190, 192, 194, 196, 198,
            200
        };

        int target = 40;

        int result = search(arr, target);

        if (result != -1) {
            System.out.println(target + " is found at index " + result);
        } else {
            System.out.println(target + " is not found!");
        }
    }


    public static int search(int arr[], int target) {

        int start = 0;
        int end = 1;

        // Keep expanding the search range
        while (end < arr.length && arr[end] < target) {

            start = end + 1;
            end = end * 2 + 1;
        }

        // Prevent end from going outside the array
        end = Math.min(end, arr.length - 1);

        return binarySearch(arr, target, start, end);
    }


    public static int binarySearch(int arr[], int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}