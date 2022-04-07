import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		int[][] numbers = new int[3][3];

		for(int i=0 ; i<numbers.length ; i++){
			for(int j=0 ; j<numbers[i].length ; j++){
				numbers[i][j] = new Random().nextInt(9)+1;//0~8までの9種類の数字に+1して選ぶ
			}
			System.out.println(Arrays.toString(numbers[i]));
			//1つめのfor文内に入れることで、出来上がった1フロアをまとめて出力してくれる(佐々木さんから)
		}
	}
}
