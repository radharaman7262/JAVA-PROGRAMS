public class insertionsort
{
	public static void main(String args[]) {
		int arr[]= {5,3,4,2,1};
		for(int i=0;i<arr.length;i++) {
			int curr=arr[i];
			int prev=i-1;
			//finding a position for inserriton
			while(prev>=0 && arr[prev]>curr) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			//insertion perform
			arr[prev+1]=curr;
		}
        for (int j=0;j<arr.length;j++) {
	        System.out.print(arr[j]+" ");
         }
	}
}