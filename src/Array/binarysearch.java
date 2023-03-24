import java.util.*;
public class binarysearch {
	public static int BinarySearch(int arr[],int key) {
	 int start=0;
	 int end=arr.length-1;
	 while(start<=end) {
		 int mid=(start+end)/2;
		 if(arr[mid]==key) {
			 return mid;
		 }
		 else if(arr[mid]<key) {
			 start=mid+1;
		 }
		 else {
			 end=mid-1;
			 
		 }
	 }return -1;
	}
 public static void main(String args[]) {
	 int arr[]= {3,4,5,21,43,34};
	 int key=4;
	 int index=BinarySearch(arr,key);
	 if (index==-1){
		 System.out.println("Key not found");
	 }
	 else {
	 System.out.print("index of "+ key + " is " + index); 
	 }
 }
}
