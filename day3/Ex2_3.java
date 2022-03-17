import java.util.*;
public class Ex2_3{
	public static void main(String[] args){
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたのお名前は？");
		String name = new Scanner(System.in).nextLine();
		System.out.print("あなたの生まれた月は？");
		String monthString = new Scanner(System.in).nextLine();
		int month = Integer.parseInt(monthString);
		System.out.print("あなたの生まれた日は？");
		String dayString = new Scanner(System.in).nextLine();
		int day = Integer.parseInt(dayString);
		int fortune = new Random().nextInt(4);
		fortune++;
		System.out.println("結果が出ました");
		System.out.println(month + "月" + day + "日生まれの" + name + "さんの今日の運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:小吉 4:吉");
	}
}
