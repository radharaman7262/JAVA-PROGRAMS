import java.util.*;
public class pairsinarray {
	public static void pairsofarray(int arr[]) {
		int Totalpair=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("(" +arr[i]+","+arr[j]+")");Totalpair++;
			}System.out.println();
		}System.out.println("total pair is "+Totalpair);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {2,4,6,8,10};
    pairsofarray(arr);
	}

}
