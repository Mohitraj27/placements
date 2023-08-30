/*
 Find Pair Given Difference
EasyAccuracy: 27.25%Submissions: 160K+Points: 2
Win from a prize pool of INR 15K and get exciting merch! Register your team for Hack-A-Thon today!

Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.

Example 1:

Input:
L = 6, N = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output: 1
Explanation: (2, 80) have difference of 78.
Example 2:

Input:
L = 5, N = 45
arr[] = {90, 70, 20, 80, 50}
Output: -1
Explanation: There is no pair with difference of 45.
Your Task:
You need not take input or print anything. Your task is to complete the function findPair() which takes array arr, size of the array L and N as input parameters and returns True if required pair exists, else return False.

Expected Time Complexity: O(L* Log(L)).
Expected Auxiliary Space: O(1).

Constraints:
1<=L<=104 
1<=Arr[i]<=105 

0<=N<=105
 */
package sorting;

import java.util.HashSet;

public class pair_given_diff {
    public static void main(String args[]){
        int n=78;
        int size=6;
         int arr[]=new int[]{5, 20, 3, 2, 5, 80};
         boolean result=pair_diff(arr, size, n);
         System.out.println(result);

    }
    // Time -O(N^2)
   public static  boolean  pair_diff(int arr[],int size,int n){
        
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
            int diff=Math.abs(arr[j]-arr[i]);
            if(diff==n){
                return true;
            }
            }
        }
        return false;
    }

//Optimzed code Time - O(N)

// public static boolean boolean_pair(int arr[],int size,int n){
    // HashSet<Integer> result=new HashSet<>();

    // for(int i=0;i<size;i++){
    //     if(result.contains(arr[i]-n) || result.contains(arr[i]+n));
    //     {
    //         return true;
    //     }
    // }
    //  return false;
// }
}
