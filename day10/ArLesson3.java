import java.util.*;
public class ArLesson{
	public static void main(String[] args){
		int[] dateA={3,5,10};//配列を宣言と同時に値を代入。内容がわかっている時はこちらが多い
		int[] dateB=new int[]{4,6,10};//値を指定しなくても0で用意してくれるdateAではやってくれない
		//dateA={0,0,0}; == dateB=new int[3];

		//1重for文
		for(int i=0 ; i<dateA.length ; i++){
			System.out.println(dateA[i]);
		}
		//拡張for文(配列を走査(最初から最後まで処理)する)
		//
		for(int n : dateB){//;でなく:を使用　拡張for文の時は意味のある変数名をつける
		//使う配列の型に合わせた変数を1つ目の部屋に用意：使う配列
		//dateBをチェックして、要素1つ目から順番に処理を実行する
		//true or falseの判定は、使う配列の要素があるかどうか
			System.out.println(dateB[n]);//4 6 10 と表示される
		}
		System.out.println(Arrays.toString(dateA));
	}
}
