import java.util.*;
public class Day24_3{
	public static void main(String[] args){
		System.out.println("あっち向いてホイをしましょう");
		System.out.println("勝ったらポイントが増えていきますよ");
		int ans = 0;//do whileの判定用に1番外
		do{//下記を1度は実行
			int point =0;//1クール終了後にリセットするため1番外
			int pc =1;
			int user =0;
			int count = 1;
			while(user!=pc){//user==pcは同じ向きになるため負け
				System.out.print("上:0・下:1・右:2・左:3 のどれかを入力してください。>>");
				user = new Scanner(System.in).nextInt();
				pc = new Random().nextInt(4);
				System.out.println(count+"回目　あっち向いて…");
				System.out.println("ホイ！");
				System.out.println();//改行

				//勝ちか負けかの判定
				if(user != pc ){
					System.out.println("あなた; "+ user +"  PC; "+ pc +"  あなたの勝ちです！");
					point++;
					System.out.println("現在のポイントは"+point+"です。");
					System.out.println();//改行
				}else{
					System.out.println("あなた; "+ user +"  PC; "+ pc +"  残念、あなたの負けです。");
					System.out.println("ポイントは"+point+"でした！");
					System.out.println();//改行
				}
			}//1クール終了

			//pc++;//終了時必ずuser==pcになってしまって、while(user!=pc)が実行されないため、pcの値を1つずらす。
			//1クール終了後に継続の確認
			System.out.println("もう一度勝負しますか？　はい：0・いいえ；1>>");
			ans = new Scanner(System.in).nextInt();
			System.out.println();
			//継続の入力が正しいかどうかの判定
			while((ans!=0) && (ans<0) || (ans>1)){
				System.out.print("0か1を入力してください");
				ans = new Scanner(System.in).nextInt();
				System.out.println();
			}
		}while(ans == 0);//はい(0)の時"do"まで戻る

		//継続しない場合の処理
		System.out.println("また勝負しましょうね！");
	}
}
