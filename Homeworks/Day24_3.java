import java.util.*;
public class Day24_3{
	public static void main(String[] args){
		System.out.println("あっち向いてホイをしましょう");
		System.out.print("上:0・下:1・右:2・左:3 のどれかを入力してください。>>");
		int user = new Scanner(System.in).nextInt();
		int pc = new Random().nextInt(4);
				System.out.println("あっち向いて…");
				System.out.println("ホイ！");
		if(user == pc ){
				System.out.println("あなた; "+ user +"  PC; "+ pc +"残念、あなたの負けです。");
			}else{
				System.out.println("あなた; "+ user +"  PC; "+ pc +"あなたの勝ちです！");
			}
	}
}

