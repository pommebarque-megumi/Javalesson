import java.util.*;
public class Fortune{
	public static void main(String[] args){
		String[] fortunes = {
			"大吉",
			"中吉",
			"小吉",
			"末吉",
			"吉",
			"凶",
		};//縦に記載するケースも多い。その場合、最後の要素にもカンマをつけてあげる
		int idx = new Random().nextInt(fortunes.length);//lngthを入れることにより、配列の要素数から自動的に抽選してくれる
		System.out.printf("今日の運勢は%sです%n",fortunes[idx]);
	}
}
