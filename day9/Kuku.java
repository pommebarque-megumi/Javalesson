import java.util.*;
public class Kuku{
	public static void main(String[] args){
		System.out.print("いくつの段から表示しますか？>>");
		int start =new Scanner(System.in).nextInt();
		System.out.print("いくつの段まで表示しますか？>>");
		int end =new Scanner(System.in).nextInt();
		for(int i=start ; i<=end ; i++){
//int i=startでiの宣言と同時にstartの値を代入してくれる。i<=endで指定した段まで表示してくれる。i++することで指定したstartの値から1ずつ段を上げてくれる
			for(int j=1 ; j<=9 ; j++){
//2つ目のforはstart～endまでの段にそれぞれ1～9まで掛けてくれる
				System.out.printf("%d*%d=%2d ",i,j,i*j);
//意味("%dかける%dイコール%2d を表示する"　,の後ろに%〇〇の中身を順番に。計算式もOK。必ずカンマ区切りで)
			}
			System.out.println();//1段終わったら改行して1つ目のforに戻る
		}
	}
}
