public class OrderAgnosticBinarySearch{
    public static void main(String args[] ){
        int array[] = new int []  { 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 };
        int ascendingArray[] = new int [] { 2,5,9,13,18,24,31,37,42,48,53,59,64,70,76,81,87,92,98,105 };
        int descendingArray [] = new int []  { 105,98,92,87,81,76,70,64,59,53,48,42,37,31,24,18,13,9,5,2 };

        System.out.println(findElement(array, 20));
        System.out.println(findElement(ascendingArray, 99));
        System.out.println(findElement(descendingArray, 32));
    
    }

     public static int findElement(int arr[], int target){
        
        if (arr.length>0){
            int order = findOrder(arr);
            if(order==0) return arr[0]==target?0:-1;
            else if (order==1) return findElementInAscendingArray(arr,target);
            else return findElementInDescendingArray(arr,target);
            }else{
            return -1;
        }
    }

    public static int findElementInAscendingArray(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2 ;

            if (target == arr[mid]){
                return mid;
            }else{
                if (target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

    public static int findElementInDescendingArray(int arr[], int target){
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start + (end - start) / 2 ;

            if (target == arr[mid]){
                return mid;
            }else{
                if (target < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

   

    public static int findOrder (int arr[]){
        if (arr[0] == arr[arr.length-1]){
            return 0;
        }else if (arr[0] < arr[arr.length-1]){
            return 1;
        }else{
            return -1;
        }
    }
}