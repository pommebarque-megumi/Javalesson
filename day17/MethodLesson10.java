import java.util.*;
public class MethodLesson10{
	public static void main(String[] args){
//MAIN METHOD//
    //method1//
		int n=10;
		method1(n);//メソッド内のコピーnが表示される・・・11
		System.out.println(n);//プロトタイプが表示される・・・10
		//原本渡し

		//method2//
		int[] arr = new int[] {1,2,3};
		method2(arr);//参照値渡し(住所を渡すので原本に影響する)
		System.out.println(arr[0]);

	}
//METHOD//
  //method1//
	static void method1(int n){//このnはメインのn(プロトタイプ)とは別物
		n++;
		System.out.println(n);//11
	}//returnがないため、メインのプロトタイプは変わらない

	//method2//
	static void method2(int[] arr){
		for(int i=0 ; i<arr.length ; i++){
			arr[i]=arr[i]+1;
		}//配列は参照型のため、プロトタイプが変更される
	}
}
