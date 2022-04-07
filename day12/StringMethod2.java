import java.util.*;
public class StringMethod2{
	public static void main(String[] args){
		String str="apple:orange:banana";//;を,に変えたい
		str=str.replace(":",",");
		System.out.println(str);

		String[] data =str.split(",");//文字列を,の所で区切って配列にする
		System.out.println(Arrays.toString(data));
		
		//配列を,で区切ってくっつけて文字列にする
		String result = String.join(" ",data);//半角でも大丈夫
		System.out.println(result);
	}
}
