import java.util.*;
public class Method4{
	public static void main(String[] args){
		System.out.print("幅を入力(cm)>>");
		double width = new Scanner(System.in).nextDouble();
		System.out.print("高さを入力(cm)>>");
		double height = new Scanner(System.in).nextDouble();

		double area = squareAreacm(width,height);
		System.out.printf("幅%.1f・高さ%.1fの長方形の面積は%.1f㎠です。%n",width,height,area);
	}
	//ここからメソッド
	public static double squareAreacm(double width , double height){
		double area = width*height;
		return area;
	}
}
