import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		/*
		 サイコロを振ってそれが偶数か奇数かを判定する
		 (実行結果)
		 ex)4は偶数です・1は奇数です
		 */
		int a = new Random().nextInt(6) +1;
		if((a== 2)||(a==4)||(a==6)){
		System.out.print(a + "は偶数です。");
		}else{
		System.out.print(a + "は奇数です。");
	  }
		//by.Sasaki
		//b = a%2;
		//if(b==0){   if(dice % 2 ==0)でも◎但し、(dice % 2 ==1)は奇数は×(マイナスの値の時困るから)
		//System.out.print(~~)
		//}else{
		//System.out.print(~~)
		//}
	}
}
