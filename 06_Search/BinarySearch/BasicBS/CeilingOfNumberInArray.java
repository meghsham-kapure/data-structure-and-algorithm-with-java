/* 
Finding a ceiling number of the given number in the array
    - ceiling number : number that is smaller in the array but greater than targeted number
    - In array [2,3,5,7,14,16,18], ceiling number for target
        - 1 => 2
        - 6 => 9
        - 14 => 14
        - 18 => 18
        - 20 => -1 
*/

public class CeilingOfNumberInArray{
    public static void main(String arg[]){
        int nums[] = new int[] {2,3,5,7,14,16,18};

        System.out.println(1+"=>"+nums[findCeilingNumber(nums,-1)]);
        System.out.println(6+"=>"+nums[findCeilingNumber(nums,6)]);
        System.out.println(14+"=>"+nums[findCeilingNumber(nums,14)]);
        System.out.println(18+"=>"+nums[findCeilingNumber(nums,18)]);
        System.out.println(20+"=>"+nums[findCeilingNumber(nums,20)]);
    }

    public static int findCeilingNumber(int nums[], int target){

        int start = 0;
        int end = nums.length-1;
        
        if (target> nums[end] ){
            return end;
        }

        while(start<=end){
            int mid = start + ( end - start) / 2;

            if(nums[mid]== target){
                return mid;
            }else if (nums[mid]> target){
                end = mid - 1;
            }else{
                start = start + 1;
            }        
        }
        
        return start;
    }
}
