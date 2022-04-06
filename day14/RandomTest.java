import java.util.*;
public class RandomTest{
	public static void main(String[] args){
		//Randomクラスのインスタンス生成
		Random rnd = new Random();
		//Scannerクラスのインスタンス生成
		Scanner scan =new Scanner(System.in);

		System.out.print("要素数");
		int n = scan.nextInt();
		int[] data = new int[n];

		for(int i=0 ; i<data.length ; i++){
			data[i] =rnd.nextInt(6);
		}
		System.out.println(Arrays.toString(data));
	}
}//2回以上ランダム数を作ったり、スキャンするならこの方法を使う。
