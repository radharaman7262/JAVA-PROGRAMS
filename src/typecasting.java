//Typeconversion:-
//import java.util.*;
//public class typecasting {
//	public static void main(String args[]) {
// int a=5;
// long b=a;
//		long a=5;
//		int b=a; //it gives error because not comatible
// System.out.println(b);
 
//}
//}


//type casting:-
//import java.lang.*;
//public class typecasting{
//	public static void main(String []args)
//	{
//		float a=25.0f;
//		int b=(int)a;
//		System.out.println(b);
//	}
//}

//type promotion:-
//java compiler convert short byte and char into int bydefault:-
//public class typecasting{
//	public static void main(String args[]) {
//		char ab='a';
//		char ba='b';
//		System.out.println(ab-ba);
		
//		char ab='a';
//		char ba='b';
//		char c=a-b;
//		System.out.println(c);
		
//		int a=5;
//		int b=3;
//		char c=a+b;
//		System.out.println(c);
		

//		short a=5;
//		byte b=23;
//		char c='c';
//		byte d=(byte)(a+b+c); //by type casting we can convert int to byte :-
//		System.out.println(d);
//		
//	}
//}

//B)when different datatypes given like long,float, or double then compiler takes bigger datatypes as bydefault:-
public class typecasting{
	public static void main(String args[]) {
//		long a=45;
//		long c=34;
//		float d=3.4f;
//		double ans=a+c+d;
//		System.out.println(ans);
	    byte b=5;
	    b=(byte)(b*2);
	    
		System.out.println(b);
	}
}

