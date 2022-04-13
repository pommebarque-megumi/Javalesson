import java.util.*;
public class ZeroTwenty{
	public static void main(String[] args){
		System.out.print("整数を入力してください>>");
		int num = new Scanner(System.in).nextInt();
		if(isIn(num)){
			System.out.printf("%dは0以上20以下の数値です%n",num);
		}else{
			System.out.printf("%dは0以上20以下の数値ではありません%n",num);
		}
	}
	static boolean isIn(int num){
		if((num>=0)&&(num<=20)){
			return true;
		}else{
			return false;
		}
	}
}
