import java.util.*;
public class Day30_3{
	public static void main(String[] args){
		//星座と何位かを入れる配列を宣言
		String[] zodiac = {"おひつじ座","おうし座","ふたご座","かに座","しし座","おとめ座","てんびん座","さそり座","いて座","やぎ座","みずがめ座","うお座"};
		/*String[] numbers = {"1位：","2位：","3,位：","4位：","5位：","6位：","7位：","8位：","9位：","10位：","11位：","12位："};*/

		//何位かを星座ごとに抽選
		for(int i=0 ; i<zodiac.length ; i++){
			int fortune = new Random().nextInt(zodiac.length-i)+i;
			String temp = zodiac[fortune];
			zodiac[fortune] = zodiac[i];
			zodiac[i] =temp;
		}
		/*for(int i=0 ; i<numbers.length ; i++){
			numbers[i] += zodiac[i];
		}*/

		//星座を順位ごとに並べたい
		for(int i=0 ; i<zodiac.length ;i++){
		System.out.printf("%2d位：%s%n",i+1,zodiac[i]);
		}
	}
}
