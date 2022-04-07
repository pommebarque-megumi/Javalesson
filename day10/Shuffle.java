import java.util.*;
public class Shuffle{
	public static void main(String[] args){
		int[] balls = {1,2,3,4,5};
		for(int i=0 ; i<balls.length-1 ; i++){//最後の一つは抽選の必要がないため要素数-1
			int ball=new Random().nextInt(balls.length-i)+i;//balls要素数から回数
			int temp = balls[ball];
			balls[ball]=balls[i];
			balls[i]=temp;
		}
		System.out.println(Arrays.toString(balls));
	}
}//12星座占いにも使えそう
