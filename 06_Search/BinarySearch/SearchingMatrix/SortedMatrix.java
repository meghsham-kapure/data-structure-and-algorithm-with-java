/* 

Question: Find the element in a matrix that is sorted row-wise and column-wise, i.e., every element in the matrix is greater than arr[i-1, j] and arr[i, j-1]. Minimize the  iteration as much as you can.

         COLUMN
    | 0  | 1  | 2  | 3
----| -- | -- | -- | --
RAW |    |    |    | 
0   | 10 | 20 | 30 | 40
1   | 15 | 25 | 35 | 45
2   | 28 | 29 | 37 | 49
3   | 33 | 34 | 38 | 50

Brute-force Approach : Linear search

Optimized Approach : Binary Search


Flow : 
    1. search diagonally, start the search form leftmost top to rightmost bottom    
    2. Compare
        Case 1. current_element_value == target_value
        Case 2. current_element_value < target_value 
        Case 3. current_element_value > target_value 
    3. 


*/



public class SortedMatrix{

    
    public static int[] findInArray(int matrix[][], int target){

        int startI =0; 
        int startJ= 0;

        int endI = matrix.length; 
        int endJ= matrix[0].length;
 
        
    
    }
}