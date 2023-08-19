package Arrays;
/*
 Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2

Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 */

import java.util.*;
public class Duplicate {
    
public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();

    int arr[]=new int[size];

    System.out.print("Enter the elements of array");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    Duplicate ob = new Duplicate();

    int result = ob.duplicate_num(arr);
    if (result != 0) {
        System.out.println("Duplicate digit is: " + result);
    } else {
        System.out.println("No duplicates found.");
    }
}

 public int duplicate_num(int arr[])    {

    HashSet<Integer> set=new HashSet<>();
    for(int num:arr){
        if(set.contains(num)){
            return num;
        }
        //if not add the element into the HashSet
        set.add(num);
    }
    return 0;
 }
}