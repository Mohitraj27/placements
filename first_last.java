
/*
 Given a sorted array arr containing n elements with possibly duplicate  is to find indexes of first elements, the taskand last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  
2 5
Explanation: 
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 
Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  
6 6
Explanation: 
First and last occurrence of 7 is at index 6.
Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 106
1 ≤ arr[i],x ≤ 109
 */


import java.util.*;
public class first_last {
   
    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        
        System.out.println("Enter the element to be search");
        int x=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("ENter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        ArrayList<Long> indices = first_last_search(arr, n, x);
        if (indices.isEmpty()) {
            System.out.println("Element not found");
        } else {
            System.out.println("First occurrence: " + indices.get(0));
            System.out.println("Last occurrence: " + indices.get(indices.size() - 1));
        }

    }
//Using Linear Search Technique
  public static ArrayList<Long> first_last_search(int arr[],int n,int x){
         
         ArrayList<Long> result=new ArrayList<Long>(); 

         int first_occurence=-1;
         int last_occurence=-1;
             for(int i=0;i<n;i++){

            if(arr[i]==x){
                if(first_occurence==-1)
                {
                    first_occurence=i;
                }
                last_occurence=i;
            }
         }
         result.add((long)first_occurence);
         result.add((long)last_occurence);
         return result;
  }
}
