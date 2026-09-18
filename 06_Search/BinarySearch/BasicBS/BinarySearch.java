public class BinarySearch{
    public static void main(String args[]){
        int arr[] = new int[] {1, 3, 4, 7, 8, 11, 12, 16, 17, 19, 21, 23, 24, 27, 29, 31};
        System.out.println(binarySearch(arr, 311));

    }

    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // int mid = (start+end)/2; bug
            int mid = start + (end - start) / 2;
            
            if (arr[mid]==target){
                return mid;
            }else{
                if (arr[mid]>target){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}