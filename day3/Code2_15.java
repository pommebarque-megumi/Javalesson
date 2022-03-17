import java.util.*;
public class Code2_15{
	public static void main(String[] args){
		System.out.print("あなたの名前を入力してください。");
		String name = new Scanner(System.in).nextLine();//文字列の情報が欲しいとき
		System.out.print("あなたの年齢を入力してください。");
		int age = new Scanner(System.in).nextInt();//整数の情報が欲しいとき
		System.out.println("ようこそ" + age +"歳の" + name + "さん");
	}
}

