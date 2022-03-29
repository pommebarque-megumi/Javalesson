import java.util.*;
public class ArrayLesson{
	public static void main(String[] args){
		/*
		 * 配列:値をまとまった塊として扱う技術
		 * */
		String[] hands={"グー"/*[0]*/,"チョキ"/*[1]*/,"パー"/*[2]*/};//必ず0からスタートする
		//配列の変数名は複数形に設定しよう
		//各部屋のこと　＝　要素　：　部屋の数　＝　要素数
		int pc = new Random().nextInt(hands.length);

		System.out.print("手を入力(グー:0 チョキ:1 パー:2)>>");
		int you = new Scanner(System.in).nextInt();

		System.out.printf("あなたは%sPCは%s%n",hands[you],hands[pc]/*handsからyouやpcで抽選された番号と同じ部屋を参照*/);
		//もしチョキが出したければ、print(hands[1]); ない部屋を参照しようとすると、実行時エラーが起こる。
		if(pc==you){
			System.out.println("あいこです");
		}else if((you+3-pc)%3 ==2){
			System.out.println("あなたの勝ちです");
		}else{
			System.out.println("あなたの負けです");
		}
	}
}
