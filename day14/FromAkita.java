import java.util.*;
public class FromAkita{
	public static void main(String[] args){
		System.out.print("正の整数>>");
		int n= new Scanner(System.in).nextInt();
		String ans;
		if(n%2==0){
			ans="偶数";
		}else/* if(n%2==1)*/{
			ans="奇数";
		}
		System.out.printf("あなたが入れた数字は%sです%n",ans);
	}
}
