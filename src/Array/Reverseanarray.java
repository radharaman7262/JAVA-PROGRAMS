//import java.util.*;
//public class Reverseanarray{
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        int arr[]= {2,4,5,6,7};
//        for(int i=arr.length-1;i>=0;i--) {
//        	System.out.print(arr[i]+" ");
//        }
//        
//	}
//
//}


//public class Reverseanarray{
//	public static int[] reversearray(int arr[]){
//		int[] ans =new int[arr.length];
//		int j=0;
//		for(int i=arr.length-1;i>=0;i--) {
//			ans[j++]=arr[i];
//		}
//		return ans;
//	}
//	public static void main(String args[]) {
//		int arr[]={3,5,2,9,2};
//		int[] w = reversearray(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(w[i]);
//		}
//				
//	}
//}

public class Reverseanarray{
	public static void reversearray(int arr[]) {
		int first=0,last=arr.length-1;
		while(first<last) {
		  int temp=arr[last];
		  arr[last]=arr[first];
		  arr[first]=temp;
		  first++;
		  last--;
		}
	}
	public static void main(String args[])
	{
		int arr[]= {2,4,5,3,5};
		reversearray(arr);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i] +" ");
		}System.out.println();   
	}
	
}