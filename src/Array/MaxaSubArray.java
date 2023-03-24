import java.util.*;
public class MaxaSubArray{
	public static void MaxArr(int arr[]) {
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				currsum=0;
				for(int k=i;k<=j;k++) {
					currsum=currsum+arr[k];
				}System.out.println("current sum "+currsum);
				if(currsum>maxsum) {
					maxsum=currsum;}
				}
			}System.out.println("maximum sum Is "+ maxsum);
    }
	public static void main(String args[]) {
		int arr[]= {2,-4,6,8,10};
		MaxArr(arr);
	}
}
