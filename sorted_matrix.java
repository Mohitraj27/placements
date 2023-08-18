import java.util.*;
public class sorted_matrix {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int N=sc.nextInt();

int arr[][]=new int[N][N];
System.out.println("Enter the elements of array");
for(int i=0;i<N;i++){
    for(int j=0;j<N;j++){
        arr[i][j]=sc.nextInt();

    }
}
  sorted(arr, N);

 // Print the sorted matrix
 System.out.println("Sorted Matrix:");
 for(int i = 0; i < N; i++) {
     for(int j = 0; j < N; j++) {
         System.out.print(arr[i][j] + " ");
     }
     System.out.println();
 }

    }

    public static void sorted(int arr[][],int N){
      
        List<Integer> ans=new ArrayList<Integer>();
 // first all the elements of the 2D array in list 
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                ans.add(arr[i][j]);
            }
        }

      // now sorted them using sorting function 
        Collections.sort(ans);
       // and now retrive them from array list and stroing them into 2D array
        int k=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
            arr[i][j]=ans.get(k);
            k++;
            }
        }
      //  return arr;

    }

}
