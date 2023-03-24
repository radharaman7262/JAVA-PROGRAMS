//import java.util.Arrays;
//public class inbuilt {
//	public static void main(String args[]) {
// int arr[]= {5,4,1,3,2};
// Arrays.sort(arr);
// for(int k=0;k<arr.length;k++) {
//	  System.out.print(arr[k]+ " ");
// }
//}
//}

//import java.util.Arrays;
//public class inbuilt{
//	public static void main(String args[]) {
//		int arr[]= {5,4,3,1,2};
//		Arrays.sort(arr,0,2);
//		  for(int k=0;k<arr.length;k++) {
//			  System.out.print(arr[k] + " ");
//		  }
//	}
//}


       //using collection:-for decreasing order:-
//import java.util.*;
//public class inbuilt{
//	public static void main(String args[]) {
//		Integer arr[]= {5,4,2,3,1};
//		Arrays.sort(arr,Collections.reverseOrder());
//		  for(int k=0;k<arr.length;k++) {
//			  System.out.print(arr[k]);
//		  }
//	}
//}


import java.util.*;
public class inbuilt{
	public static void main(String args[]) {
		Integer arr[]= {3,4,2,5,1};
		Arrays.sort(arr,0,3,Collections.reverseOrder());
		  for(int k=0;k<arr.length;k++) {
			  System.out.print(arr[k]);
		  }
	}
}