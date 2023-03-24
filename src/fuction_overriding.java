//overloading with changing type  of  parameters:-
//public class fuction_overriding {
// public static int  sum(int a,int b) {
// int c=a+b;
// return c;
// }
// public static float sum(float a,float b) {
//	 return a+b;
// }
// public static void main(String args[]) {
//   int d=sum(3,5);
//   System.out.println(d);
//   float e=sum(4.5f,24.4f);
//   System.out.println(e);
// }
// 
// 
//}


//overloading with changing in no. of parameter:-
public class fuction_overriding{
	public static int  sum(int a,int b) {
	  return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String args[]) {
		
		System.out.println(sum(4,5,3));
		System.out.println(sum(3,5));
	}
}