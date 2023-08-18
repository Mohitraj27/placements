/*
 Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.

Example 1:
Input:
N = 4
mat[][] =     {{16, 28, 60, 64},
                   {22, 41, 63, 91},
                   {27, 50, 87, 93},
                   {36, 78, 87, 94 }}
K = 3
Output: 27
Explanation: 27 is the 3rd smallest element.
 

Example 2:
Input:
N = 4
mat[][] =     {{10, 20, 30, 40}
                   {15, 25, 35, 45}
                   {24, 29, 37, 48}
                   {32, 33, 39, 50}}
K = 7
Output: 30
Explanation: 30 is the 7th smallest element.


Your Task:
You don't need to read input or print anything. Complete the function kthsmallest() which takes the mat, N and K as input parameters and returns the kth smallest element in the matrix.
 

Expected Time Complexity: O(K*Log(N))
Expected Auxiliary Space: O(N)

 

Constraints:
1 <= N <= 50
1 <= mat[][] <= 10000
1 <= K <= N*N
 */

import java.util.*;
public class kth_smallest_matrix {
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    System.out.println("Enter the value of k");
       int k=sc.nextInt();
    int matrix[][]=new int[n][n];
     System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix[i][j]=sc.nextInt();

        }
    }
    kth_smallest_matrix ob=new kth_smallest_matrix();
  
    int ans=ob.kth_smallest(matrix, n,k);
    System.out.println("Kth smallest element will be  "+ans);

    }
    public  int kth_smallest(int matrix[][],int n,int k){
   
        List<Integer> result=new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            result.add(matrix[i][j]);

            }
        }
            
         Collections.sort(result);
        return result.get(k-1);
    }

 
}
