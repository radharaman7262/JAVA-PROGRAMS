//import java.util.*;
//public class Conditonalstatement {
//public static void main(String args[]) {
//	Scanner s=new Scanner(System.in);
//	int age=s.nextInt();
//	if(age>18) {
//		System.out.println("can vote");
//	}
//	else if((age>13) && (age<=18)) {
//		System.out.println("Teenager");
//	}
//		
//	else {
//		System.out.println("cannot vote");
//	}
//}
//}


//import java.util.*;
//public class Conditonalstatement {
//public static void main(String args[]) {
//	Scanner s=new Scanner(System.in);
//	int a=s.nextInt();
//	int b=s.nextInt();
////	if(a>b) {
////		System.out.println(a+" is greater n0");
////	}
////	else {
////		System.out.println(b+" is greater no");
////	}
//	if (a>b) System.out.println(a +" is greater");
//	else System.out.println(b +" is greater");
//}
//}

//import java.util.*;
//public class Conditonalstatement {
//public static void main(String args[]) {
//	Scanner s=new Scanner(System.in);
//	int num=s.nextInt();
//	if(num%2==0) {
//		System.out.println(num+" is even");
//	}
//	else {
//		System.out.println(num+" is odd");
//	}
//}
//}

//import java.util.*;
//public class Conditionalstatement{
//	public static void main(String args[]) {
//		Scanner s=new Scanner(System.in);
//		int Income=s.nextInt();
//		int tax;
//		if(Income<=700000) {
//			System.out.println("No tax");
//		}
//		else if(Income<=1200000 && Income>700000) {
//			tax=(Income*20/100);
//			System.out.println(tax + " have to pay");
//		}
//		else {
//			tax=(Income*30/100);
//			System.out.println(tax + " have to pay");
//			}
//		}
//	}

//import java.util.*;
//public class Conditionalstatement{
//	public static void main(String args[]) {
//		Scanner s=new Scanner(System.in);
//		int a=s.nextInt();
//		int b=s.nextInt();
//		int c=s.nextInt();
////		if (a>b) {
////			if(a>c) {
////				System.out.println(a +" is greater");
////			}
////			else {
////				System.out.println(b +" is greater");
////			}
////		}
////		else {
////			if(b>c) {
////				System.out.println(b +" is greater");
////			}
////			else {
////				System.out.println(c +" is greater");
////			}
////		}
//		if((a>=b) && (a>=c)){
//			System.out.println(a+ " is greater");
//		}
//		else if(b>=c) {
//			System.out.println(b+ " is greater");
//		}
//		else {
//			System.out.println(c+" is greater");
//		}
//	}
//}

//ternary operator:-
import java.util.*;
public class Conditionalstatement{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
//		int a,b;
//		a=s.nextInt();
//		b=s.nextInt();
//		int n=a>b?a:b;
//		System.out.println(n);
		
		int marks=s.nextInt();
		String result=marks>=33?"pass":"fail";
		System.out.println(result);
		
		
	}}

