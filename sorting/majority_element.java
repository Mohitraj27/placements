/*
 Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.

Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.
 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 

Constraints:
1 ≤ N ≤ 107
0 ≤ Ai ≤ 106
 */

package sorting;

import java.util.HashMap;
import java.util.Scanner;

public class majority_element {

    static int majority(int arr[],int size){

        int ans=-1;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<size;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
        }

        for(int i=0;i<size;i++){
            if(map.get(arr[i])>size/2){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
         int arr[]=new int[size];
        System.out.println("Entr the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int result=majority(arr, size);
        if(result!=-1){
        System.out.println("Majority ELement found  "+result);
        } else{
            System.out.println("Majority ELement not found");
        }

    }
    
}
