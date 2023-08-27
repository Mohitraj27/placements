package sorting;

import java.util.*;



public class selection_sort {
    
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");

      int n=sc.nextInt();
      int arr[]=new int[n];

      System.out.println("Enter the elements of array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      selection_sort ob=new selection_sort();
      ob.selection(arr, n);
      ob.print(arr,n);
    }
     
    public void print(int arr[],int n){
     System.out.println("Elements after selcetion sort technqiue");
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");

     }
     System.out.println();
    }
    // function for selection sorting technique
    public void selection(int arr[],int n){
     /*
      Algorithm used
       1. Dividde the given array into parts i.e sorted and unsorted array
       2. find the minimum elements from an unsorted array and comapres with leftmost element of unsorted array and if small then swap that 
       element with leftmost element of unsorted array. and that elemenet now becomes part of sorted array
       3. now repeat this till unsorted array is not empty

       Time - Worst & Avg case O(N^2) 
       Space - O(1) auxilary space
      */
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min])
            {
                min=j;            }
            }
         int temp=arr[min];
         arr[min]=arr[i];
         arr[i]=temp;
        
        }
    }
}
