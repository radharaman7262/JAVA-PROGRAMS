//import java.util.*;
//public class Array {
//   public static void main(String args[]) {
//	   int raman[]=new int[5];
//	   System.out.println("Enter the subject of 5 marks");
//	   Scanner s=new Scanner(System.in);
//	   System.out.println("Ener 1st marks");
//	   raman[0]= s.nextInt();
//	   System.out.println("Ener 2nd marks");
//	   raman[1]=s.nextInt();
//	   System.out.println("Ener 3rd marks");
//	   raman[2]=s.nextInt();
//	   System.out.println("Ener 4th marks");
//	   raman[3]=s.nextInt();
//	   System.out.println("Ener 5th marks");
//	   raman[4]=s.nextInt();
//	   System.out.println("1st marks" + " = " + raman[0]);
//	   System.out.println("2nd marks" + " = " + raman[1]);
//	   System.out.println("3rd  marks" + " = " + raman[2]);
//	   System.out.println("4th marks" + " = " + raman[3]);
//	   System.out.println("5th marks" + " = " + raman[4]);
//	   //for update 
//	   raman[2] = 100;
//	   System.out.println("2nd marks updated" +raman[2]);
//	   //for change marks:-
//	   raman[2]=raman[2]+2;
//	   System.out.println("2nd maRKS NOW " + raman[2]);
//	   
//	   int percentage=(raman[0]+raman[1]+raman[2]+raman[3]+raman[4])/5;
//	   System.out.println("percentage" +" = " +percentage);
//	   int l=raman.length;
//	   System.out.println(raman.length);
//	   
//   }
//}


//public class Array{
//	public static void main(String args[]) {
//		int marks[]= {23,42,42,53,53};
//		for(int i=0;i<5;i++) {
//			System.out.println(marks[i]);
//		}
//	}
//}

//public class Array{
//	public static void main(String args[]) {
//	 char marks[]=new char[5];
//	 for(int i=0;i<5;i++) {
//		 System.out.println(marks[i]);
//	 }
//	}
//}

//public class Array{
//	public static void updateno(int marks[]) {
//		for (int i=0;i<marks.length;i++) {
//			marks[i]=marks[i]+2;
//		}
//	}
//	public static void main(String args[]) {
//		int marks[]= {34,54,45};
//		updateno(marks);
//		for(int i=0;i<marks.length;i++) {
//			System.out.print(marks[i] + " "); // call by reference proves:-
//		}
//		System.out.println();
//	}
//}


//public class Array{
//	public static void updateno(int marks[],int nonchangable) {
//		nonchangable=10;
//		for (int i=0;i<marks.length;i++) {
//			marks[i]=marks[i]+2;
//		}
//	}
//	public static void main(String args[]) {
//		int marks[]= {34,54,45};
//		int nonchangable=5;
//		updateno(marks,nonchangable);
//		System.out.println(nonchangable);
//		for(int i=0;i<marks.length;i++) {
//			System.out.print(marks[i] + " "); // call by reference proves:-
//		}
//		
//		System.out.println();
//	}
//}


//Linear Search of array:-
//public class Array{
//	public static int lsearch(int arr[],int element) {
//		for(int i=0;i<=arr.length;i++) {
//			if (arr[i]==element){
//				return i;
//			}
//		}
//		return -1;
//	}
//	public static void main(String args[]) {
//		int arr[]= {3,4,5,6,3,52,54};
//		int element=54;
//		int LinearSearch=lsearch(arr,element);
//		if(LinearSearch==-1) {
//			System.out.println("Not Found");
//		}
//		else {
//			System.out.println("element found at " + LinearSearch);
//		}
//	}
//}

//public class Array{
//	public static int lsearch(String HotelDish[],String Dish) {
//		for(int i=0;i<HotelDish.length;i++) {
//			if (HotelDish[i]==Dish){
//				return i;
//			}
//		}
//		return -1;
//	}
//	public static void main(String args[]) {
//		String HotelDish[]= {"Dosha","Samosa","idly","chola batora"};
//		String Dish="Samosa";
//		int LinearSearch=lsearch(HotelDish,Dish);
//		if(LinearSearch==-1) {
//			System.out.println("Not Found");
//		}
//		else {
//			System.out.println("element found at " + LinearSearch);
//		}
//	}
//}

//find the largest number in a given array;-
//import java.util.*;
//public class Array{
//	public static int greatestno(int numbers[]) {
//		int Largestno=Integer.MIN_VALUE;
//		for(int i=0;i<numbers.length;i++) {
//			if(Largestno<numbers[i]) {
//				Largestno=numbers[i];
//			}
//		}
//		return Largestno;
//		
//	}
//	public static void main(String args[]) {
//		int numbers[]= {2,4,5,1,82,394};
//		System.out.println(greatestno(numbers));
//		  
//	}
//}


//import java.util.*;
//public class Array{
//	public static int findsmallest(int number[]) {
//		int smallestno=Integer.MAX_VALUE;
//		for(int i=0;i<number.length;i++) {
//			if(smallestno>number[i]) {
//				smallestno=number[i];
//			}  
//		}return smallestno;
//	}
//	public static void main(String args[]) {
//		int number[]= {3,5,2,56,2,1};
//		System.out.println(findsmallest(number));
//	}
//}

