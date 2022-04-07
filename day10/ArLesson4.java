import java.util.*;
public class ArLesson4{
	public static void main(String[] args){

		int[] arrA = {4,8,10};
		int[] arrB = {7,1,3};

		for(int i=0 ;i<arrA.length;i++){
			System.out.println(arrA[i]);
		}

		for(int dateB : arrB);{
			System.out.println(arrB[dateB]);
		}

		int[] arrC =new int[3];

		for(int i=0 ; i<arrC.length ;i++){
			arrC[i] = arrA[i]*2;
		}
		System.out.println(Arrays.toString(arrC));

		for(int i=0 ;i<arrC.length ; i++){
			arrC[i] += arrB[i]; 
		}
		System.out.println(Arrays.toString(arrC));

		/*10.合計を管理するint型の整数sumを宣言し、０で初期化する。
11.拡張for文を用いてarrCの値の合計を求める。
12.arrCの合計を「合計は55です。」という形式で出力する。*/
	}
}
