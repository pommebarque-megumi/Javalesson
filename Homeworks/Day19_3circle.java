public class Day19_3circle{
	public static void main(String[] args){
		final double pi = 3.14;
		System.out.println("円の面積を求めましょう。直径を入力してください。(単位はcm)");
		double pie = new java.util.Scanner(System.in).nextInt();
		double pie1 = pie/2;
		double answer = pie * pie *pi;
		System.out.println(pie1 + "×" + pie1 + "×" + pi + "=" + answer);
		System.out.println("答え：直径が" + pie + "cmの円の面積は" + answer + "㎠です。");
	}
}
