import java.util.*;
public class insertion_sort {
    
    public static void main(String args[]){
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
          int n=sc.nextInt();
          int arr[]=new int[n];

          System.out.println("Enter the elements of array");
          
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }

          insertion_sort ob=new insertion_sort();
          ob.insertion(arr, n);
          ob.printArray(arr,n);
    }

    public void printArray(int arr[],int n){
        System.out.println("Sorted elements ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Main algorithm for insertion sort
    public void insertion(int arr[],int n)
    {
     
        for(int i=0;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=temp;
        }
    }
}
