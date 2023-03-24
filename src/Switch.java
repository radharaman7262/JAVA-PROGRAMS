//import java.util.*;
//public class Switch {
//public static void main(String args[]) {
//	Scanner s=new Scanner(System.in);
//	System.out.println("Enter 1 for samosa order\nEnter 2 for Rosogulla order");
//	int number=s.nextInt();
//	switch(number) {
//	case 1:
//		System.out.println("Samosa ordered");
//		break;
//	case 2:
//		System.out.println("rosogulla ordered");
//		break;
//    default:
//    	System.out.println("Press valid");
//}
//}
//}

import java.util.*;
public class Switch {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two number");
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("Enter operator for calculations:");
	char operator=s.next().charAt(0);
	switch(operator) {
	case '+':
		System.out.println(a+b);
		break;
	case '-':
		System.out.println(a-b);
		break;
	case '*':
	    System.out.println(a*b);
	    break;
	case '/':
		System.out.println(a/b);
		break;
	default:
		System.out.println("press valid key");
}
}
}
