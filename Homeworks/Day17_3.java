import java.util.*;
public class Day17_3{
	public static void main(String[] args){
		System.out.println("あなたの性格からピッタリなペットを選びましょう！");
		System.out.println("ユーザーネームを入力してください。");
		String name = new Scanner(System.in).nextLine();
		System.out.println("ようこそ" + name + "さん。次の質問に数字で答えてください。");
		System.out.println("休日は何をしたいですか？当てはまる数字を入力してください。");
		System.out.println("キャンプ→1　ショッピング→10　映画鑑賞→20　家でゲーム→30");
		int hobby = new Scanner(System.in).nextInt();
		System.out.println("次のうち好きな色は？当てはまる数字を入力してください。");
		System.out.println("赤→2　黄→4　青→8　黒→10");
		int color = new Scanner(System.in).nextInt();
		System.out.println("次の中で1番乗りたいものは？当てはまる数字を入力してください。");
		System.out.println("馬→5　自転車→10　船→15　車→20");
		int ride = new Scanner(System.in).nextInt();
		int total = (hobby + color + ride);
		System.out.println("あなたのTotalは　：" + total + "点でした。");
		System.out.println("Totalが　8～23点なら：犬　　24～35点なら：猫　　36～44点なら：熱帯魚　　45～60点なら：観葉植物です。");
	}
}
