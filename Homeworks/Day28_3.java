import java.util.*;
public class Day28_3{
	public static void main(String[] args){
		System.out.print("名前を入力してください>>");
		String name = new Scanner(System.in).nextLine();
		String[] animals = {"ダルメシアン","オウム","金魚","トカゲ","変な虫"};
		int an = new Random().nextInt(4);
		String[] foods = {"ハンバーガー","焼き鳥","ステーキ","キヌアサラダ","パエリア"};
		int fn = new Random().nextInt(4);
		System.out.printf("%sさんは%sと%sが好きな人と仲良くなれそうです！%n",name,foods[fn],animals[an]);
	}
}
