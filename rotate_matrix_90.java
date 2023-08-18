/*
 Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space. 

Example 1:

Input:
N = 3 
matrix[][] = {{1, 2, 3},
              {4, 5, 6}
              {7, 8, 9}}
Output: 
Rotated Matrix:
3 6 9
2 5 8
1 4 7
Example 2:

Input:
N = 2
matrix[][] = {{1, 2},
              {3, 4}}
Output: 
Rotated Matrix:
2 4
1 3

Your Task:
You dont need to read input or print anything. Complete the function rotateby90() which takes the matrix as input parameter and rotates it by 90 degrees in anti-clockwise direction without using any extra space. You have to modify the input matrix in-place. 

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 100
1 <= matrix[][] <= 1000
 */

 import java.util.*;

import javax.swing.plaf.synth.SynthEditorPaneUI;
public class rotate_matrix_90 {
    
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
       
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

       rotate_matrix(matrix, n);
        
        System.out.println("Sorted Matrix by 90 degreee ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

   public static void rotate_matrix(int matrix[][],int n){
          for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){
                
            
                int temp = matrix[i][j];
                
                matrix[i][j] = matrix[j][n-i-1];
                matrix[j][n-i-1] = matrix[n-1-i][n-j-1];
                matrix[n-1-i][n-j-1] = matrix[n-j-1][i];
                matrix[n-j-1][i] = temp;
            }
          }
    
    }
}
