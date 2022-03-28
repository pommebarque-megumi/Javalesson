import java.util.*;
public class Practice{
	public static void main(String[] args){
		/*好きな数字を選ぶ1～10
		 * ランダム整数1～10をかける
		 結果が
		 もし偶数なら→
		 もし奇数なら→
		 */
		System.out.println("明日の朝ごはんをクジで決めましょう！");
		System.out.println("1～10の中で好きな数字を入力してください。");
		int a = new Scanner(System.in).nextInt();
		int b = new Random().nextInt(10)+1;
		int c = a+b;
		if(c %22 == 0){
			System.out.print("目玉焼きとトースト");
		}else{
			System.out.print("シリアルとヨーグルト");
		}
	}
}
