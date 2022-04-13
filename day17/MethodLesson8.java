import java.util.*;
public class MethodLesson8{
	//Math.maxと同じ
	static int largeOf(int a,int b){
		if(a>=b){
			return a;
		}else{
			return b;
		}
	}

	//面積を求める
	static double rectArea(double height,double width){
		return height*width;
	}

	//偶数か奇数かのtrue or false
	static boolean isEven(int n){
		return n%2==0;
	}

	public static void main(String[] args){
		System.out.print("整数を入力してください>>");
		int a = new Scanner(System.in).nextInt();
		System.out.print("整数を入力してください>>");
		int b = new Scanner(System.in).nextInt();
		System.out.println(largeOf(a,b));

		System.out.print("整数を入力してください>>");
		double d = new Scanner(System.in).nextInt();
		System.out.print("整数を入力してください>>");
		double e = new Scanner(System.in).nextInt();
		System.out.println(rectArea(d,e));


		System.out.print("整数を入力してください>>");
		int x=new Scanner(System.in).nextInt();;
		if(isEven(x)){
			System.out.println(x+"は偶数");
		}else{
			System.out.println(x+"は奇数");
		}
	}
}
