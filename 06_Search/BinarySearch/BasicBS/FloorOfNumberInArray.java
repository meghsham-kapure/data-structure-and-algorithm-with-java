public class FloorOfNumberInArray{
    public static void main(String args[]){

        int nums[] = new int[] {2,3,5,7,14,16,18};

        System.out.println(findFloorOfNumberInArray(nums,-1));
    }

    public static int findFloorOfNumberInArray(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        if (target < arr[0]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            else if (target > arr[mid]){
                start = mid + 1;
            }
            
            else{
                end = mid - 1;
            }
        }

        return start;
    }
}

