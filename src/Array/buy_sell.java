import java.util.*;
public class buy_sell {
 public static int netprofit(int price[]) {
	 int buyingprice=Integer.MAX_VALUE;
	 int maxprofit=0;
	 for(int i=0;i<price.length;i++) {
		 if (buyingprice<price[i]) {
			 int profit=price[i]-buyingprice;
			 maxprofit=Math.max(profit,maxprofit);
		 }
		 else {
			 buyingprice=price[i];
		 }
	 }return maxprofit;
 }
 public static void main(String args[]) {
	 int price[]= {7,1,5,3,6,4};
	 System.out.println(netprofit(price));
 }
}
