package sorting;
import java.util.*;
public class merge_sort 
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of input array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements of input array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        merge_sort ob=new merge_sort();
        ob.sort(arr,0,n-1);
        ob.print(arr, n);

    }

    public void print(int arr[],int n){
        System.out.print("Sorted elements :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public void sort(int arr[],int l,int r){
        if(l<r){
            int m=(l+r)/2;
            
            //sorting using recursion for first half of array
            sort(arr, l, m);
            //sorting using recursion for second half of array
            sort(arr, m+1, r);

            merge_sort(arr,l,m,r);
        }
    }
    public void merge_sort(int arr[],int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;

        //Create temp array for both the halves of array
        int L[]=new int[n1];
        int R[]=new int[n2];

        //copy data to  both the  temp arrays
        for(int i=0;i<n1;++i){
            L[i]=arr[l+i];
        }

            for(int j=0;j<n2;++j){
             R[j]=arr[m+1+j];
            }



            // Now merging both the temp array
            int i=0,j=0;
            int k=l;
            while (i<n1 && j<n2) {
                if(L[i]<=R[j]){
                    arr[k]=L[i];
                    i++;
                }
                else{
                    arr[k]=R[j];
                    j++;
                }
                k++;
            }

            //copying remaining elements of Left and right subarray
            while (i<n1) {
                arr[k]=L[i];
                i++;
                k++;
            }

            while (j<n2) {
                arr[k]=R[j];
                j++;
                k++;
            }
        }
    }

