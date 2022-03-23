import java.util.*;
public class Gacha{
	public static void main(String[] args){
	/*
	  SSR 5%
	  SR 10% 
	  R  20%
		N  65%
	 * */
		System.out.println("エンターキーを押してね");
		new Scanner(System.in).nextLine();
		int seed = '菅' + '原' + 'め' + 'ぐ' + 'み';
		int n = new Random(seed).nextInt(100);//Random()のカッコにシード値を入力をすると、同じ数値だけが毎回出る。何が出るかはシード値次第。
		if(n < 5){
			System.out.println("SSR!!");
		}else if(n < 15){
			System.out.println("SR!");
		}else if(n < 35){
			System.out.println("R");
		}else
			System.out.println("Normal");
	}
}
