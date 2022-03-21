import java.util.*;
public class Day21_3triangle{
	public static void main(String[] args){
		System.out.println("三角形の面積を求めましょう");
		System.out.println("まず底辺の長さを入力してください。単位はｃｍです");
		double teihen = new Scanner(System.in).nextDouble();
		System.out.println("次に高さを入力してください。単位はｃｍです");
		double takasa = new Scanner(System.in).nextDouble();
		double ans = teihen * takasa / 2;
		System.out.println("式：" + teihen + "×" + takasa + "÷" + 2 + "=" + ans);
		System.out.println("答え：" + ans + "㎠です。");
	}
}
