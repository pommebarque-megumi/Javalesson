import java.util.*;
public class ArLesson1{
	public static void main(String[] args){
		int[] nums = new int[3];//[要素数3]のint型配列を作ります　という宣言方法
		System.out.println(nums.length);//3と表示される
		System.out.println(nums[0]);//0
		System.out.println(nums[1]);//1
		System.out.println(nums[2]);//2
		//System.out.println(nums[3]);実行時エラー(例外:Exception)

		//値を入れる
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		//値を見る(参照)
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		//演算
		nums[0] = nums[1]+nums[2];//20+30 = 50が[0]の所に上書き代入される
		System.out.println(nums[0]);//50と表示される

	}
}
