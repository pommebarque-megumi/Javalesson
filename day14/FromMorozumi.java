import java.util.*;
public class FromMorozumi{
	public static void main(String[] args){
		System.out.print("整数1>>");
		int a = new Scanner(System.in).nextInt();
		System.out.print("整数2>>");
		int b = new Scanner(System.in).nextInt();

		int ans =0;
		for(int i=0 ; i<b ; i++){
			ans = a*a;
		}

		System.out.printf("%dの%d乗は%dです。%n",a,b,ans);
	}
}
