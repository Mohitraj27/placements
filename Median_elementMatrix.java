
/*
Problem statemnet : Median in a row-wise sorted Matrix

 Given a row wise sorted matrix of size R*C where R and C are always odd, find the median of the matrix.

Example 1:

Input:
R = 3, C = 3
M = [[1, 3, 5], 
     [2, 6, 9], 
     [3, 6, 9]]
Output: 5
Explanation: Sorting matrix elements gives 
us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median. 

Example 2:

Input:
R = 3, C = 1
M = [[1], [2], [3]]
Output: 2
Explanation: Sorting matrix elements gives 
us {1,2,3}. Hence, 2 is median.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function median() which takes the integers R and C along with the 2D matrix as input parameters and returns the median of the matrix.

Expected Time Complexity: O(32 * R * log(C))
Expected Auxiliary Space: O(1)


Constraints:
1 <= R, C <= 400
1 <= matrix[i][j] <= 2000

*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Median_elementMatrix
{
    public  static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("ENter the row & columns of the matrix");
      int R=sc.nextInt();
      int C=sc.nextInt();

      int matrix[][]=new int[R][C];
System.out.println("Enter the elements of the matrix");
      
      for(int i=0;i<R;i++)
      {
        for(int j=0;j<C;j++)
        {
            matrix[i][j]=sc.nextInt();
        }
      }
sc.close();
 int median = Median(matrix, R, C);
        System.out.println("Median of spiral matrix: " + median);
    }
   public static int Median(int matrix[][],int R,int C)
    {
        ArrayList<Integer> result=new ArrayList<Integer>();

        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++){
                result.add(matrix[i][j]);
            }
            
        }
               Collections.sort(result);
               return result.get((R*C)/2);
    }
}