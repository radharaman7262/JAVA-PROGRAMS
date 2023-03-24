import java.util.*;
public class kedansalogarray {
	public static void kedansalg(int arr[]) {
	   int currsum=0;
	   int maxsum=Integer.MIN_VALUE;
	   for(int i=0;i<arr.length;i++) {
		   currsum=currsum+arr[i];
		   if(currsum<0) {
			   currsum=0;
		   }maxsum=Math.max(maxsum,currsum);
	   }System.out.println("maxsum is "+ maxsum);
	}
 public static void main(String args[]) {
	 int arr[]= {2,4,6,8};
	 kedansalg(arr);
 }
}
