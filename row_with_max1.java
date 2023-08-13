

/*
 * Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:

Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).

Example 2:

Input: 
N = 2, M = 2
Arr[][] = {{0, 0}, {1, 1}}
Output: 1
Explanation: Row 1 contains 2 1's (0-based
indexing).

Your Task:  
You don't need to read input or print anything. Your task is to complete the function rowWithMax1s() which takes the array of booleans arr[][], n and m as input parameters and returns the 0-based index of the first row that has the most number of 1s. If no such row exists, return -1.
 

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N, M ≤ 103
0 ≤ Arr[i][j] ≤ 1 
 */

import java.util.Scanner;

public class row_with_max1 {
    
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columnms of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
     row_with_max1 obj=new row_with_max1();
       int result=obj.max1(arr,r,c);
       System.out.println(result);
    }

    public static int max1(int arr[][],int r,int c){
      
          for(int i=0;i<r;i++)
          { int count=0;
            for(int j=0;j<c;j++)
            {
                 if(arr[i][j]==1)
                 {
                    count++;
                 }
            }

          }
          return i;


    }
}
