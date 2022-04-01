import java.util.*;
public class StringLesson1{
	public static void main(String[] args){
		//英文を入力してもらい、letterに入れる
		System.out.println("任意の英文を入力してください");
		String letter = new Scanner(System.in).nextLine();

		//5文字ごとに改行出力
		for(int i=0 ; i<letter.length() ;i++){
			System.out.print(letter.charAt(i));
			if((i+1)%5==0){
				System.out.println();
			}
		}
		System.out.println();
	} 
}
