import java.util.*;
import java.util.Arrays;
public class Day30_3{
	public static void main(String[] args){
		//星座と何位かを入れる配列を宣言
		String[] zodiac = {"おひつじ座","おうし座","ふたご座","かに座","しし座","おとめ座","てんびん座","さそり座","いて座","やぎ座","みずがめ座","うお座"};
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};

		//何位かを星座ごとに抽選
		for(int i=0 ; i<numbers.length ; i++){
			int fortune = new Random().nextInt(numbers.length-i)+i;
			int temp = numbers[fortune];
			numbers[fortune] = numbers[i];
			numbers[i] =temp;
			System.out.printf("%s：%d位%n%n",zodiac[i],numbers[i]);
		}
		/*星座を順位ごとに並べたい
		Arrays.sort()src;
		System.out.println(Arrays.toString(numbers))これだと星座を動かせないから×*/
	}
}
