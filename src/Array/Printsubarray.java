import java.util.*;
public class Printsubarray {

	public static void subarray(int arr[]) {
		int totalpair=0;
	   for(int i=0;i<arr.length;i++) {
		   for(int j=i;j<arr.length;j++) {
			   for(int k=i;k<=j;k++) {
				   System.out.print(arr[k]+" ");
			   }
			   totalpair++;
			   System.out.println();
		   }System.out.println();
	   }System.out.println("toralpair is "+ totalpair);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,4,6,8,10};
        subarray(arr);
	}

}
