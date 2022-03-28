import java.util.*;
public class Day24_3{
	public static void main(String[] args){
		System.out.println("あっち向いてホイをしましょう");
		System.out.println("勝ったらポイントが増えていきますよ");

		int count = 1;
		int point =0;
		int user =0;
		int pc =1;
		int ans = 0;
		do{
			for( ; pc != user ; count++){

			System.out.print("上:0・下:1・右:2・左:3 のどれかを入力してください。>>");
			user = new Scanner(System.in).nextInt();
			pc = new Random().nextInt(4);
			System.out.println(count+"回目　あっち向いて…");
			System.out.println("ホイ！");

			if(user == pc ){
				System.out.println("あなた; "+ user +"  PC; "+ pc +"残念、あなたの負けです。");
			}else{
				System.out.println("あなた; "+ user +"  PC; "+ pc +"あなたの勝ちです！");
				point++;
			System.out.println("現在のポイントは"+point+"です。");
			}
			}
			System.out.println("ポイントは"+point+"でした！");
			System.out.println("もう一度勝負しますか？　はい：0・いいえ；1>>");
			ans = new Scanner(System.in).nextInt();
			if((ans!=0) && (ans<0) || (ans>1)){
				System.out.print("0か1を入力してください");
			}else{
				pc++;
			}
		}while(ans == 0);
		System.out.println("また勝負しましょうね！");
	}
}
