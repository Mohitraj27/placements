/*
 *Leetcode 33. Search in Rotated Sorted Array
Medium

23834

1395

Add to List

Share
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
 */

package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class search_roated_sorted_array {
 
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of array");
     int n=sc.nextInt();

     System.out.println("Enter the target elment  of array");
     int target=sc.nextInt();
     
      int arr[]=new int[n];

     System.out.println("Enter the elements of array");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
            }
     int linear_searching=Linear_search_roated(arr,target,n);
     int binary_searching=binary_search_rotated(arr,target,n);
     
     System.out.println("Desired result using linear searching "+linear_searching);
     System.out.println("Desired result using binary searching "+binary_searching);
     
    }
   
    // using linear search technique - O(N)
    public static int Linear_search_roated(int arr[],int target,int n)
    {
        // int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //using binary seacrch technqieu - O(Logn)
    public static int binary_search_rotated(int arr[],int target,int n)
    { 
    
        // int n=arr.length();
       int low=0,high=arr.length-1;
         while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
        
            if (arr[mid] >= arr[low]) { // Left half is sorted
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // Right half is sorted
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
         }
         return -1;
    }


}
