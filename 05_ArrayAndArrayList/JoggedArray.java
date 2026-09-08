import java.util.Scanner;

public class JoggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows is array : ");
        int rows = sc.nextInt();

        int[][] jaggedArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of cols is array : ");
            int cols = sc.nextInt();

            jaggedArray[i] = new int[cols];
            for (int j = 0; j < jaggedArray[i].length; j++) {
            System.out.print("For JoggedArray["+i+"]["+j+"] enter value : ");
                jaggedArray[i][j]= sc.nextInt();
            }
        }

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j]+"\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
