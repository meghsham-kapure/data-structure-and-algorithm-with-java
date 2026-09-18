/*
Rotation Count in a Rotated Sorted array: Given a sorted array arr[] (in strictly increasing order) that has been right-rotated k times. A right rotation means the last element is moved to the first position, and the remaining elements are shifted one position to the right. Find the value of k the number of times the array was right-rotated from its originally sorted form.

Examples:

    Input: arr[] = [15, 18, 2, 3, 6, 12]
    Output: 2
    Explanation: 
    Original sorted array = [2, 3, 6, 12, 15, 18]
    After 2 right rotations → [15, 18, 2, 3, 6, 12]  

    Input: arr[] = [7, 9, 11, 12, 5]
    Output: 4
    Explanation: 
    Original sorted array = [5, 7, 9, 11, 12]  
    After 4 right rotations → [7, 9, 11, 12, 5]

    Input: arr[] = [7, 9, 11, 12, 15]
    Output: 0
    Explanation: Array is already sorted, so k = 0  

*/


import java.util.*;

public class RotationCountInRotatedSortedArray{
    public static void main(String arg[]){
     
        System.out.println("Rotation Count in Rotated Sorted Array "+Arrays.toString(new int [] {15,18,2,3,6,12})+" is "+findRotationCount(new int [] {15,18,2,3,6,12}));
        System.out.println("Rotation Count in Rotated Sorted Array "+Arrays.toString(new int [] {7,9,11,12,5})+" is "+findRotationCount(new int [] {7,9,11,12,5}));
        System.out.println("Rotation Count in Rotated Sorted Array "+Arrays.toString(new int [] {13,15,18,2,3,6,12})+" is "+findRotationCount(new int [] {13,15,18,2,3,6,12}));
        System.out.println("Rotation Count in Rotated Sorted Array "+Arrays.toString(new int [] {2,3,6,12,13,15,18})+" is "+findRotationCount(new int [] {2,3,6,12,13,15,18}));
        System.out.println("Rotation Count in Rotated Sorted Array "+Arrays.toString(new int [] {5,7})+" is "+findRotationCount(new int [] {5,7}));
        System.out.println("Rotation Count in Rotated Sorted Array "+Arrays.toString(new int [] {7,5})+" is "+findRotationCount(new int [] {7,5}));
    
    
    







    }

    public static int findRotationCount(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end - start) / 2;

            if (arr[mid]<arr[0]) end = mid -1;
            else start = mid + 1;
        }
        // System.out.println(start);
        return start % arr.length;
    }
}