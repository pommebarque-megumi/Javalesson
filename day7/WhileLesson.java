import java.util.*;
public class WhileLesson{
	public static void main(String[] args){
		int count = 0;
		int n = 0;
		while(n != 7){
			count++;
			n = new Random().nextInt(10);
			System.out.println(n);
		}
		System.out.println(count + "回目で7が出ました");
	}
}

		/*		int n = 5;
		while(n > 0){//()の中はループする条件
			System.out.println(n);//ここまでだと無限ループ
			n --;//無限ループさせないように nから-1をする指示
		}//ここでループ内容は終わり。
		System.out.println("発射！");//最後の出力は必ず改行しておく。*/

			/*if(n == 7){
				break;//breakはswitch or loopのみで出る*/

