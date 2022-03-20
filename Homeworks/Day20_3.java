public class Day20_3{
	public static void main(String[] args){
		System.out.println("四角形の面積を求めます。");
		System.out.println("縦の値を入力してください。単位は㎝です。");
		double y = new java.util.Scanner(System.in).nextDouble();
		System.out.println("縦の値を入力してください。単位は㎝です。");
		double x = new java.util.Scanner(System.in).nextDouble();
		double answer = y*x;
		System.out.println(y + "×" + x + "＝" + answer);
		System.out.print("面積は" + answer + "㎠です。");
	}
}
