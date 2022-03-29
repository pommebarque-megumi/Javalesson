import java.util.*;
public class Scores{
	public static void main(String[] args){
		System.out.print("何人?>>");
		int n = new Scanner(System.in).nextInt();
		int[] scores = new int[n];//nの数だけ、初期値が0の要素ができる
		/*scores[0]=new Random().nextInt(100);
		scores[1]=new Random().nextInt(100);
		scores[2]=new Random().nextInt(100);
		scores[3]=new Random().nextInt(100);このように代入することもできる*/
		for(int i=0 ; i<scores.length ;i++){
			scores[i]=new Random().nextInt(101);//iの中の数値によって乱数の入る部屋が指定される
		}
		System.out.println(Arrays.toString(scores));

		int sum=0;
		for(int i=0 ; i<scores.length ; i++){
			sum += scores[i];
		}
		System.out.println("点数の合計は:"+sum);
		System.out.println("平均は:"+sum/scores.length);

		int max=scores[0];
		int min=scores[0];
		for(int i=1 ; i<scores.length ;i++){
			if(scores[i] > max){
				max = scores[i];
			}
			if(scores[i] < min){
				min = scores[i];
			}
		}
		System.out.printf("最高点は%s点・最低点は%s点です%n",max,min);
	}
}
