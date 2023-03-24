

//*      *           
//**    **
//***  ***
//********
//********
//***  ***
//**    **
//*      *
//public class Advancepattern {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n=4;
//		for(int i=1;i<=n;i++) {
//			//star
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			//space
//			for(int k=1;k<=2*(n-i);k++) {
//				System.out.print(" ");
//			}
//		    //star
//			for(int m=1;m<=i;m++) {
//				System.out.print("*");
//			}System.out.println();
//		}
//        for(int i=n;i>=1;i--) {
//        	//star
//        	for(int j=1;j<=i;j++) {
//        		System.out.print("*");
//        	}
//        	//space
//        	for(int j=1;j<=2*(n-i);j++) {
//        		System.out.print(" ");
//        	}
//        	//star
//        	for(int k=1;k<=i;k++) {
//        		System.out.print("*");
//        	}System.out.println();
//        }
//	}
//
//}


//    *****
//   *****
//  *****
// *****
//*****
//public class Advancepattern{
//	public static void main(String args[]) {
//		int n=5;
//		for(int i=1;i<=5;i++) {
//			//space
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			//star
//			for(int j=1;j<=5;j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
//	
//	}
//}



//   *
//  ***
// *****
//*******
//*******
// *****
//  ***
//   *
//public class Advancepattern{
//	public static void main(String args[]) {
//		int n=4;
//		for(int i=1;i<=n;i++) {
//			//space
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			//star
//			for(int j=1;j<=(2*i)-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=n;i>=1;i--) {
//		   //space
//			for(int m=1;m<=n-i;m++)
//			{
//				System.out.print(" ");
//			}
//		   //star
//			for(int k=1;k<=(2*i)-1;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}



//    *****
//   *   *
//  *   *
// *   *
//*****
//public class Advancepattern{
//	public static void main(String args[]) {
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			//space
//			for(int j=1;j<=n-i;j++)
//			{
//				System.out.print(" ");
//			}
//			//star
//			for(int j=1;j<=5;j++) {
//				if(i==1 || i==n || j==1 || j==n)
//				System.out.print("*");
//				else {
//					System.out.print(" ");
//				}
//			}System.out.println();
//			
//		}
//	}
//}

//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5 
//public class Advancepattern{
//	public static void main(String args[]) {
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			//space
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//				}
//			//star
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//	}
//}


//    1
//   212
//  32123
// 4321234
//543212345
//public class Advancepattern{
//	public static void main(String args[]) {
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			//space
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			//no
//			for (int k=i;k>=1;k--) {
//				System.out.print(k);
//			}
//	    	for( int k=2;k<=i;k++) {
//	    		System.out.print(k);
//	    	}System.out.println();
//	    }
//	}
//}
