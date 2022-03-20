public class Day19_3{
	public static void main(String[] args){
		final double pi = 3.14;
		System.out.println("円の面積を求めましょう。直径を入力してください。(単位はcm)");
		int pie = new java.util.Scanner(System.in).nextInt();
		double answer = (pie/2)*(pie/2)*pi;
		System.out.println("直径が" + pie + "cmの円の面積は" + answer + "㎠です。");
	}
}
