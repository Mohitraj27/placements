/*
Searching in an array where adjacent differ by at most k
 A step array is an array of integers where each element has a difference of at most k with its neighbor. Given a key x, we need to find the index value of x if multiple elements exist, and return the first occurrence of the key.

Example 1:

Input : arr[ ] = {4, 5, 6, 7, 6}, K = 1 
        and X = 6
Output : 2
Explanation:
In an array arr 6 is present at index 2.
So, return 2.

Example 2:

Input : arr[ ] = {20 40 50}, K = 20 
        and X = 70
Output :  -1 
 

Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function search() that takes an array (arr), sizeOfArray (n), an integer value X, another integer value K, and return an integer displaying the index of the element X in the array arr. If the element is not present in the array return -1. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

 

Constraints:
1 ≤ N ≤ 105
1 ≤ K ≤ 102
1 ≤ arr[i], X ≤ 105


 */
package sorting;
import java.util.*;
public class searching_diifer {

    static int search(int arr[],int n,int x,int k){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
             return count;   
            }
            count++;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to be search");
        int x=sc.nextInt();
        
        System.out.println("Enter the value of K");

        int k=sc.nextInt();
        int arr[]=new int[]{4, 5, 6, 7, 6};
        int n=arr.length;
        int result=search(arr,n,x,k );
          System.out.println(result);
    }
}
