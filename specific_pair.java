/*
 Given an n x n matrix mat[n][n] of integers, 
 find the maximum value of mat(c, d) – mat(a, b) over all choices of indexes such that both c > a and d > b.

Example: 

Input:
mat[N][N] = {{ 1, 2, -1, -4, -20 },
             { -8, -3, 4, 2, 1 }, 
             { 3, 8, 6, 1, 3 },
             { -4, -1, 1, 7, -6 },
             { 0, -4, 10, -5, 1 }};
Output: 18
The maximum value is 18 as mat[4][2] 
- mat[1][0] = 18 has maximum difference. 

 */


import java.util.*;
public class specific_pair {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the size of 2D matrix");
        int n=sc.nextInt();


        int matrix[][]=new int[n][n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){;
            for(int j=0;j<n;j++){

            matrix[i][j]=sc.nextInt();
            }
        }
         specific_pair ob=new specific_pair();
        int result=ob.pair(matrix,n);
        System.out.println("Maximum Value is"+result);

    }
  
    public static int pair(int matrix[][],int n){
       
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1;j++)
                for(int c=i+1;i<n;i++)
                    for(int d=i+1;d<n;d++)
                    if(maxValue<(matrix[c][d]-matrix[i][j]))
                        maxValue=matrix[c][d]-matrix[i][j];

        return maxValue;

         
    }
}
