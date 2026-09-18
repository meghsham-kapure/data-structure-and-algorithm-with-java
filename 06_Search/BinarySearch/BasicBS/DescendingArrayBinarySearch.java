public class DescendingArrayBinarySearch{
        public static void main(String args []){

        findElement(2);
        findElement(24);
        findElement(44);
        findElement(59);
        findElement(81);
        findElement(88);
        findElement(105);
    }   

    public static void findElement (int target){
        
        int arr [] = { 105,98,92,87,81,76,70,64,59,53,48,42,37,31,24,18,13,9,5,2 }; 
        
        int result = binarySearch( arr, target );
        if (result!=-1) System.out.println("Element " + target + " is found at index " + result);
        else System.out.println("Element " + target + " is not found!");
        
    }

    public static int binarySearch(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + ( end - start) / 2;

            if(target ==  arr[mid]){
                return mid;
            }else{
                if (target <= arr[mid] ){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }

        return -1;

    }

}