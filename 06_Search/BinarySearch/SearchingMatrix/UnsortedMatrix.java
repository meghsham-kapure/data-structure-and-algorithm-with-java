import java.util.*;

public class UnsortedMatrix{
    public static void main(String args[]){
                
        int arr[][] = new int[][] {
            { 495,  11,  97, 393,  64 },
            { 599,  22,  93,  45, 191 },
            { 297,  33,  56,  95,  99 },
            {  66,  65,  44,  91, 297 }
        };

        System.out.println("\t\tMatrix\n");
        for(int[] i : arr){
            for (int j : i) System.out.print(j+"\t");
            System.out.println();
        }

        int target = 33;
        int found[] =  new int [] {-1,-1};

        // traversing columns
        for(int i = 0; i<arr.length; i++){
            
            // traversing rows
            for(int j = 0; j<arr[i].length; j++){  
            
                // checking index [i][j]
                if (arr[i][j]== target){ 
                    found =  new int [] {i,j};
                    break;
                }

            }
            
        }

        System.out.println("\nFound at "+Arrays.toString(found));
    
    }
}