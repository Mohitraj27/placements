// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class sample {
    //Code for binary search 



public static int binary(int arr[],int target){
int low=0;
int high=arr.length-1;
while(low<=high){
int mid=low+(high-low)/2;

if(arr[mid]==target){

return mid;
}

else if(arr[mid]<target){
low=mid+1;
}
else{
high=mid-1;
}

}
return -1;
}
 
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value to be search");
int target=sc.nextInt();
System.out.println("Enter the size of array");
int n=sc.nextInt();
int arr[]=new int[n];

System.out.println("Enter the elements of array");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
  int result=binary(arr,target);
if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
}


}