import java.util.*;
public class Dice{
	public static void main(String[] args){
		int dice = new Random().nextInt(6)+1;
		/*String result;
		if(dice%2 ==0){
			result ="偶数";
		}else{
			result ="奇数";
		}*/ //条件演算子(三項演算子)
		String result = dice % 2 == 0 ? "偶数":"奇数";
		System.out.printf("%dは %sです %n",dice,result);
		System.out.printf("%dは %sです %n",dice,(dice%2==0)?"偶数":"奇数");
		/*System.out.println(dice);
		if(dice%2==0){
			System.out.println(dice+"は偶数です");
		}else{
			System.out.println(dice+"は奇数です");
		}*/
	}
}
