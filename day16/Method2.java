import java.util.*;
public class Method2{
	public static void main(String[] args){

		int[] data = new int[]{2,3,4};
		int total = sumof(data);
		System.out.println(Arrays.toString(data));
		System.out.println("合計は"+total);
		total = sumof(new int[]{10,20,30});
		System.out.println("合計は"+total);

	}
	public static int sumof(int[] arr){
		int sum=0;
		for(int n : arr){
			sum += n;
		}
		return sum;
	}
}
