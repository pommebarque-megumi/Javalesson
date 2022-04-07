import java.util.*;
public class ArLesson5{
	public static void main(String[] args){
		int[] dates = new int[10];

		for(int i=0 ; i<dates.length ; i++){
			int dice = new Random().nextInt(6)+1;//説明変数　わかりやすくするために使う
			dates[i] = dice;
			//dates[i] =new Random().nextInt(6)+1;練習中は短く書いて、仕事の時は長くても丁寧に。
		}
		System.out.println(Arrays.toString(dates));
	}
}
