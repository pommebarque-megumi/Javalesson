import java.util.*;
public class Swap{
	public static void main(String[] args){
		int a=10;
		int b=20;
		/*
		 *処理
		 */

		System.out.println("a:"+a+",b:"+b);
		//a:10,b:20を交換して、a:20,b:10とする
		//2つの値の交換アルゴリズム
		int temp = a;//入れ替え用の変数は必ず"temp"を使用
		a=b;
		b=temp;
		System.out.println("a:"+a+",b:"+b);
		
		int keep = a;
		a=b;
		b=keep;
		System.out.println("a:"+a+",b:"+b);

		int[] data={3,2,5,1,4};
		/*処理=4,1,5,2,3にしたい
		int temp = data[0];
		data[0] = date[4];
		date[4] = tempここまでだと42513*/

			for(int i=0 ; i<data.length/2 ; i++){
				int temp=data[i];
				data[i]=data[data.length-1-i];//-1は要素数とアドレスの問題
				data[data.length-1-i]=data=temp;//-iはやらないと全て1番後ろの値に変わってしまうから
			}
		System.out.println(Arrays.toString(data));
	}
}
