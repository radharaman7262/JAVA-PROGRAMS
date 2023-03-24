
//public class function {
//public static void prnt() {
//	System.out.println("hello world");
//}
//public static void main(String args[]) {
//	print();
//}
//}
//import java.util.*;
//public class function{
//	public static void sum() {
//		Scanner s=new Scanner(System.in);
//		int a=s.nextInt();
//		int b=s.nextInt();
//	    int c=a+b;
//	    System.out.println(c);
//	}
//	public static void main(String args[]) {
//		sum();
//	}
//}

//import java.util.*;
//public class function{
//	public static int sum() {
//		Scanner s=new Scanner(System.in);
//		int a=s.nextInt();
//		int b=s.nextInt();
//	    int c=a+b;
//	    return c;
//	}
//	public static void main(String args[]) {
//		int d=sum();
//		System.out.println(d);
//	}
//}

//import java.util.*;
//public class function{
//	public static int sum(int a,int b) { //paramaeter -formal parameter
//		Scanner s=new Scanner(System.in);
//		int c=a+b;
//		return c;
//	}
//	public static void main(String args[]) { //Argument -Actual Arguments
//		int d=sum(4,5);
//		System.out.println(d);
//	}
//}


//swap function:-
//import java.util.*;
//public class function{
//	public static void swap() {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter two numner a and b");
//		int a=s.nextInt();
//		int b=s.nextInt();
//		int temp=a;
//	    a=b;
//	    b=temp;
//	    System.out.println("a ="+a);
//	    System.out.println("b ="+b);
//		
//	}
//	public static void main(String args[]) {
//		swap();
//	}
//}

//import java.util.*;
//public class function{
//	public static void swap(int a,int b) {
//		Scanner s=new Scanner(System.in);
//		int temp=a;
//	    a=b;
//	    b=temp;
//	    System.out.println("a ="+a);
//	    System.out.println("b ="+b);
//		
//	}
//	public static void main(String args[]) {
//		swap(6,8);
//	}
//}


//import java.util.*;
//public class function{
//	public static void swap(int a,int b) {
//		Scanner s=new Scanner(System.in);
//		int temp=a;
//	    a=b;
//	    b=temp;
//	}  
//		swap(a,b);
//		System.out.println("a ="+a);
//	    System.out.println("b ="+b);
//	}
//}


//import java.util.*;
//public class function{
//	public static int multiply(int a,int b) {
//		int product=a*b;
//		return product;
//	}
//	public static void main(String args[]) {
//		int pdt=multiply(5,3);
//		System.out.println(pdt);
//		
//	}
//}

 // to find a factorial:-
//import java.util.*;
//public class function {
//	public static int fact(int n) {
//		int factorial=1;
//		for(int i=1;i<=n;i++) {
//			factorial=factorial*i;
//		}
//		int m=factorial;
//		return m;
//	}
//	public static void main(String args[]) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter a number to find the factorial");
//		int n=s.nextInt();
//		int t=fact(n);
//	    System.out.print(t);
//		
//	}
//}


//to find a binomial coefficent:-
//public class function{
//	public static int factorial(int n) {
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact*=i;
//		}
//		return fact;
//	}
//	public static void bin_coffecient(int n,int r) {
//		int a=factorial(n);
//		int b=factorial(r);
//		int c=factorial(n-r);
//		int bin_coff=a/(b*c);
//		System.out.println(bin_coff);
//	}
//	public static void main(String args[]) {
//		bin_coffecient(5,3);
//	}
//}






//public class function{
//	public static boolean primeornot(int n) {
//		if (n==2) { //corner case
//		return true;
//		}
//		for(int i=2;i<=n-1;i++){
//			if(n%i==0) {
//				return false;
//			}
//			
//		}
//		return true;
//	}
//	public static void main(String args[]) {
//		boolean ans=primeornot(2);
//		System.out.println(ans);
//	}
//}
//import java.math.*;
//public class function{
//	public static String primeornot(int n) {
//		if (n==2) { //corner case
//		return ("yes it is prime");
//		}
//		//optimized code:-
//		for(int i=2;i<=Math.sqrt(n);i++){
//			if(n%i==0) {
//				return "not it is not prime";
//			}
//			
//		}
//		return "yes it is prime";
//	}
//	public static void main(String args[]) {
//		String ans=primeornot(8);
//		System.out.println(ans);
//	}
//}


//public class function{
//	public static boolean primeno(int n) {
//		for(int i=2;i<=n;i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}return true;
//	}
//	public static void primeno_range(int n) {
//		for(int i=2;i<=n;i++) {
//			if(primeno(i)){ //true
//				System.out.print(i +" ");
//			}
//		}
//		System.out.println();
//	}
//	public static void main(String args[]) {
//		primeno_range(20);
//	}
//}

//public class function{
//	public static boolean primeno(int n) {
//		if(n==2) return true;
//		for(int i=2;i<=Math.sqrt(n);i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}return true;
//	}
//	public static void primeno_range(int n) {
//		for(int i=2;i<=n;i++) {
//			if(primeno(i)){ //true
//				System.out.print(i +" ");
//			}
//		}
//		System.out.println();
//	}
//	public static void main(String args[]) {
//		primeno_range(20);
//	}
//}/

//conversion of binary to decimal:-
//public class function{
//	public static void bintodecimal(int n) {
//      int mynum=n;
//		int pow=0;
//		int dec=0;
//		while(n>0) {
//		int Lastdigit=n%10;
//		dec=dec + (Lastdigit*(int)Math.pow(2,pow));
//		pow++;
//		n=n/10;
//		}System.out.println("Decimal value of " + mynum + " is "+ dec);
//	}
//	public static void main(String args[]) {
//	  bintodecimal(101);
//	}
//}


//conversion of decimal to binary:-
public  class function{
	public static void decimaltobinary(int decimalno) {
		int Mynum=decimalno;
		int pow=0;
		int binaryvalue=0;
		while(decimalno>0) {
		    int LastDigit=decimalno%2;
		    binaryvalue=binaryvalue + (int)(LastDigit*Math.pow(2,pow));
		    pow++;
		    decimalno=decimalno/2;
		}System.out.println("Binary value of " + Mynum + " is " + binaryvalue);
	}
	public static void main(String args[]) {
		decimaltobinary(5);
	}
}

