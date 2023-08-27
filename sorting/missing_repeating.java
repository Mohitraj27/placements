
/*
 Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.
Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and 
smallest positive missing number is 2.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of size 2 denoting the answer ( The first index contains B and second index contains A.)

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ N ≤ 105
1 ≤ Arr[i] ≤ N
 */

package sorting;
import java.util.*;
public class missing_repeating {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=sc.nextInt();
      
      int arr[]=new int[n];

      System.out.println("Enter the elements of array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      Repeating_missing(arr, n);
    }
   
    
    public static int Repeating_missing(int arr[],int n){
          int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(arr[i]==arr[i+1]){
                result+=arr[i];
            }
          }



        
           // missing element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

    }
}
