import java.util.*;
public class AgeApp{
	public static void main(String[] args){
		System.out.print("age>>");
		int age= new Scanner(System.in).nextInt();
		if(age >= 65){//if文　処理の分岐をしたい時 >=以上、<=以下、>より大きい、<未満、==等しい
			System.out.println("高齢者です");
		}else if(age >= 20){
			System.out.println("成人です");
		}else if(age >= 3){
			System.out.println("子どもです");
		}else{//それ以外（elseがないと何も表示されず終わり）
			System.out.println("赤ちゃんです");
		}
	}
}
