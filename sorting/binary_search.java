package sorting;
import java.util.*;
class binary_search{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();

int arr[]=new int[n];

System.out.println("Enter the target value");
int target=sc.nextInt();

System.out.println("Enter the elements of array");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

int result=binary(arr,target);
if(result!=-1)
{
System.out.println("Element  Found at index  "+result);

}
else{
System.out.println("Element not found ");
}
}

static int binary(int arr[],int target){
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

}
//1 2 872 87 10 2 76