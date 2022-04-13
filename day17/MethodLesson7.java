import java.util.*;
public class MethodLesson7{
//int型の引数を2つ受け取りその和を返すメソッド
	static int sumOf(int a,int b){
		return a+b;
	}

	public static void main(String[] args){
		//sumOFに引数3と5を渡すと8が返ってくる
		int sum = sumOf(3,5);
		//結果を出力
		System.out.println(sum);//8
		//返ってくる値を直接出力することもできる
		System.out.println(sumOf(10,20));//30
	}
}
