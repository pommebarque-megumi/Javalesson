import java.util.*;
public class Day18_3{
	public static void main(String[] args){
		System.out.println("あなたの推定寿命を表示します。");
	  System.out.println("まずは名前を入力してください");
		String name = new Scanner(System.in).nextLine();
	  System.out.println(name + "さんの好きな食べ物は何ですか？");
		String food = new Scanner(System.in).nextLine();
	  System.out.println(food + "が好きな" + name + "さんの推定寿命は");
		int lifespan = new Random().nextInt(130) + 120;
		System.out.println(lifespan + "歳です。");
	}
}
