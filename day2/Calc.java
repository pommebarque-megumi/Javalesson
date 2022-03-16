public class Calc{
	public static void main(String[] args){
		//←コメント用。""は文字列の出力
		System.out.println("3 + 3");

		System.out.println(3 + 3);//足し算
		System.out.println(3 - 3);//引き算
		System.out.println(4 * 3);//掛け算
		System.out.println(4 / 3);//割り算(整数限定)
		System.out.println(4 % 3);//割り算余りあり
		
		System.out.println(7*(3+2)/3);//11
		System.out.println(7*3+5/2);//22
    //文字列連結
		System.out.println("Hello" + "World");//Hello world
		System.out.println("Hello" + 3);//Hello3
		System.out.println(2+"Hello" + 3);//2Hello3
		//System.out.println(2-"Hello" + 3);//エラー javaでは文字列に使用できる演算子は+のみ
		System.out.println("答えは" +3+2+"です");//答えは32です
		System.out.println("答えは" +(3+2)+"です");//答えは5です
		System.out.println(5.0/2);//2.5
		System.out.println(2.0+3.4);//5.4
		System.out.println(5.0+"Hallo");//5.4
	}
}
