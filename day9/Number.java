import java.util.*;
public class Number{
	public static void main(String[] args){

		System.out.print("幅>>");
		int wide =new Scanner(System.in).nextInt();
//ユーザーに数値を入力してもらう
		boolean isWin =false;
//ゲーム全体が勝ちなのか負けなのか判定する変数

		for(int i=0 ; i<3 ;i++){//1つ目のfor文
			boolean isLine =true;//boolearn型はis~と変数名をつける決まり
			int first = 0;

			for(int j=0 ; j<wide ;j++){//2つ目のfor文
				int rnd =new Random().nextInt(9)+1;
				System.out.print(rnd);

				if(j==0){//フラグを立てる：何かのアクションによってfalseがtrueに変わる
					first=rnd;
				}else{
					if(first != rnd){
						isLine=false;
					}
				}
			}//2つ目のfor文ここまで
			System.out.println();//改行
		if(isLine){
			isWin=true;
		}
		}//1つ目のfor文ここまで

		System.out.println(isWin?"あたり♪":"はずれ");
	}
}
