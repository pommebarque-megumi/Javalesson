import java.util.*;
public class StringLesson3{
	public static void main(String[] args){
		System.out.print("整数を,で区切って入力してください>>");
		String number = new Scanner(System.in).nextLine();
//配列にする
		String[] decimals = number.split(",");

//int型にする・計算する
		int total=0;
		for(int i=0 ; i<decimals.length ; i++){
			total +=Integer.parseInt(decimals[i]);
		}

//表示する
		System.out.printf("合計は%dです。%n",total);
	}
}
