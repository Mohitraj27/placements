package sorting;
import java.util.*;

public class bubble_sort {
    
    public static void main(String args[]){
   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
      
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      bubble_sort ob=new bubble_sort();
      ob.bubble(arr, n);
      ob.printArray(arr, n);
       

    }


  public void printArray(int arr[],int n){
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  //main function for bubble sort with time - O(N^2) and space O(1)
    public void bubble(int arr[],int n)
    {
        boolean isSwapped;
        for(int i=0;i<n-1;i++){
            isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                  
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
 