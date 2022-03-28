import java.util.*;
public class High_low{//{}←In Block.have to make Indent.
	public static void main(String[] args){//インデントがずれると動かない言語も！
		int card1 = new Random().nextInt(13)+1;//同じブロック内はインデントも揃える
		Sytem.out.println("1枚目のカードは"+ card1 +"です。");
		Sytem.out.println("さて、次のカードは1枚目のカードよりもHighかLowか？");
		String ans = new Scanner(System.in).next();//high lowくらいならlineはいらない

		int card2 = new Random().nextint(13)+1;//縦の改行は見やすくするためならOK
		System.out.println(card2);
		if((ans.equalsIgnoreCase("High") && card1 < card2)||(ans equarlsIgnoreCase("Low") && card1 > card2)){
			// &&かつ ||もしくは ==等しい ※”=”は”代入”である ||を使うときは前後を（）でくくろう。
			System.out.println("You Win!");//if文のブロックに入ったため、更にインデントを作る。
		}else{
			System.out.println("You Lose...");//semi coron
		}//Indentはルールに従うことが大切.ずれたらShift + =2回  /  gg Shift+vg でオール選択→shift + =
	}
}
