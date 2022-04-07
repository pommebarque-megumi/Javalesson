import java.util.*;
public class ArLesson2{
	public static void main(String[] args){
		int[] nums = new int[5];

		System.out.println(nums[0]);//先頭の要素の内容
		System.out.println(nums.length);//要素の数

		nums[0] = 100;
		nums[4] = 150;//nums[nums.length-1]=150; -1するのは要素数に対してつけられているアドレスが1小さい数だから
		nums[2] = 120;
		nums[1] = nums[2]-nums[0];

		System.out.println(nums[1]);

	}
}
