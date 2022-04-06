import java.util.*;
public class Difference{
	public static void main(String[] args){
		int a=10;
		intb=a;
		b++;
		System.out.println(a);
		System.out.println(b);

		int[] arrA = new int[]{3,5};
		int[] arrB = arrA;
		arrB[0]=100;
		System.out.println(arrA[0]);
		System.out.println(arrB[0]);

		int x =0;

		int[] arrC = null;//とりあえず配列だけ作っておく時
		System.out.println(arrC);

		int[] arrD = {1,2,3};
		arrD = null;//これだと1,2,3はゴミ箱へ…
		int[] arrE = {1,2,3};
		int[] arrF = arrE;
		arrE = null;//こちらはFが指してくれているのでゴミにならない！
	}
}
