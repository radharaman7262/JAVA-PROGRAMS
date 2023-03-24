import java.util.*;
public class prefixarray {
    public static void prefixarra(int arr[])
    {   int currsum=0;
        int maxsum=Integer.MIN_VALUE;
    	int prefixarr[]=new int[arr.length];
    	prefixarr[0]=arr[0];
    	for(int i=1;i<arr.length;i++) {
    		prefixarr[i]=prefixarr[i-1]+arr[i];
    	}
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i;j<arr.length;j++) {
    			currsum=i==0?prefixarr[j]:prefixarr[j]-prefixarr[i-1];
    		}
    		if(maxsum<currsum) {
    			maxsum=currsum;
    		}
    	}System.out.println("Maxsum is "+maxsum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {3,5,6,7,8};
    prefixarra(arr);
	}

}
