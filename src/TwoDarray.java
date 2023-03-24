//import java.util.*;
//public class TwoDarray {
//	public static void main(String args[]) {
// int arr[][]=new int[3][3];
// Scanner s=new Scanner(System.in);
//       for(int i=0;i<arr.length;i++) {
//    	   for(int j=0;j<arr.length;j++) {
//    		   arr[i][j]=s.nextInt();
//    	   }
//       }
//       //output
//       for(int i=0;i<arr.length;i++) {
//    	   for(int j=0;j<arr.length;j++) {
//    		   System.out.print(arr[i][j]+ " ");
//    	   }System.out.println();
//       }
//	}
//}


import java.util.*;
public class TwoDarray{
	public static boolean searchelement(int arr[][],int key) {
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr.length;j++) {
    		if(arr[i][j]==key) {
    			System.out.println("element found at ("+i+","+j+")");
    			return true;
    		}
    	}
    }System.out.println("element does not found");
    return false;
	}
public static void main(String args[]) {
	int arr[][]=new int[3][3];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			arr[i][j]=s.nextInt();
		}
	}
	int key=4;
    searchelement(arr,key);
	
}	
}