
/*
 Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).


Example 1:

Input:
A = 978, B = 518, C = 300
Output:
518
Explanation:
Since 518>300 and 518<978, so 
518 is the middle element.

Example 2:

Input:
A = 162, B = 934, C = 200
Output:
200
Exaplanation:
Since 200>162 && 200<934,
So, 200 is the middle element.

Your Task:
You don't need to read input or print anything.Your task is to complete the function middle() which takes three integers A,B and C as input parameters and returns the number which has middle value.


Expected Time Complexity:O(1)
Expected Auxillary Space:O(1)


Constraints:
1<=A,B,C<=109
A,B,C are distinct. 
 */

package sorting;

import java.util.*;
import java.util.Scanner;

public class Middel_three {
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three elements ");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int result=Middle(A, B, C);
        System.out.println(result);
    }

    public static int Middle(int A,int B, int C)
    {
        int arr[]={A,B,C};
      int n=arr.length;
        // Arrays.sort(arr);
        // passing bubble sort technqiye
        sorting(arr,n);
        return arr[1];

    }
    
    public static void sorting(int arr[],int n)
    {
    
        boolean isSwapped;
        for(int i=0;i<n-1;i++){
            isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false){
                break;
            }
        }
      
    }
}
