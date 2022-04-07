import java.util.*;
public class Score{
	public static void main(String[] args){
		//1.人数を聞く
		System.out.print("何人>>");
		int n = new Scanner(System.in).nextInt();
		//2.int型配列を人数分で初期化する
		int[] scores = new int[n];
		//3.forを使ってランダムな点数配列に
		scores = new Random().nextInt(101);
		//4.降順ソート
		for(int i=0 ;i<score.length-1;i++){//iの1番最後は比較する対象がないからi<score.length-1
			for(int j=i+1 ; j<score.length ;j++){//iで選んだ1つ右隣りから比較していくため j=i+1 全ての要素と比較するためj<score.length
				if(scores[i]<scores[j]){
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
		}
		//5.出力
		System.out.println(Arrays.toString(Scores));
	}
}
