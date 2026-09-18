public class AscendingArrayBinarySearch {
    public static void main(String args []){

        int target = 13;
      
        findElement(2);
        findElement(24);
        findElement(44);
        findElement(59);
        findElement(81);
        findElement(88);
        findElement(105);
    }   

    public static void findElement (int target){
        
        int arr [] = { 2,5,9,13,18,24,31,37,42,48,53,59,64,70,76,81,87,92,98,105 }; 
        
        int result = binarySearch( arr, target );

        if (result!=-1){
            System.out.println("Element "+target+" is found at index " + result);
        }else{
            System.out.println("Element "+target+" is not found!");
        }
    }

    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid =  start + (end - start) / 2; 

            if(target == arr [mid]){
                return mid;
            }else{
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}