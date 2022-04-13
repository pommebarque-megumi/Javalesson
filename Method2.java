import java.util.*;
public class Method2{
	public static void main(String[] args){
		Random rnd = new Random();
		int[][] nums = new int[3][3];
		int count =0;
		for(int i=0 ; i<nums.length ; i++){
			for(int j =0 ; j<nums[i].length ; j++){
				nums[i][j] = rnd.nextInt(9)+1;
				System.out.print(nums[i][j]);
			}
			System.out.println();
			if(isWin(nums[i])){
				count ++;
			}
		}
		if(count > 0){
			System.out.printf("%d Line Win !!%n",count);
		}else{
			System.out.println("Lose...");
		}
		System.out.println(isWin(nums[0]));
	}
	public static boolean isWin(int[] arr){
		int first = arr[0];
		for(int i=0 ; i<arr.length ; i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}
}
