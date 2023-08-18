/*
Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

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
import java.util.*;
class row_max_1
{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter rows and columns of array");
      int n=sc.nextInt();
      int m=sc.nextInt();

      int arr[][]=new int [n][m];
      System.out.println("Enter the elements of the array");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
      }
     row_max_1 ob=new row_max_1();
      int result=ob.row_withmax1(arr,n,m);
      System.out.println("final result"+result);
    }

    public int row_withmax1(int arr[][],int n,int m){

        /*
         this is solved using two pointer approach 
         l -> column pointer and r -> row ptr
         maxrow is iterator and so it is intialized with -1
         iterating through each elements using two ptrs approcah with condition that it contains 1
         if it decrement the ptrs by 1 nad assign maxrow with r
         */
        int l=m-1,r=0;
        int maxrow=-1;

        while(l>=0 && r<n){
            if(arr[r][l]==1){
          l--;
          maxrow=r;
            }
            else{
                r++;
            }
        }
        return maxrow;


    }

}


