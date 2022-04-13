import java.util.*;
public class DiscountSale{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("金額を入力してください>>");
		int price = scan.nextInt();
		System.out.print("割引率を％で入力してください>>");
		double discount = scan.nextInt();
		double newPrice = discountPrice(price,discount);
		System.out.printf("%d円の%.1f％OFFは%.0f円です%n",price,discount,newPrice);
		scan.close();
	}
/*METHOD*/
	static double discountPrice(int price , double discount){
		double offPrice = (price*discount)/100;
		double newPrice = price - offPrice;
		return newPrice;
	}
}
