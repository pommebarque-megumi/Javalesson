public class MethodLesson5{
	static void printLine(int width){
		for(int i=0 ; i<width ; i++){
			System.out.print("*");
		}
		System.out.println();
	}
	static void titleMaker(int width,String title){
		printLine(width);
		System.out.println("★"+title);
		printLine(width);
	}

	public static void main(String[] args){
		titleMaker(25,"ヤクルトスワローズ優勝");
		System.out.println("20年ぶり総合優勝を果たしました！");
		System.out.println();
		titleMaker(30,"HOKUO全店閉店へ");
		System.out.println("小田急沿線で愛されたベーカリーストア「HOKUO」が全店閉店となりました。");
		System.out.println();
		titleMaker(30,"和柄がかわいいディズニーグッズ");
		System.out.println("春の新作としてディズニーストア公式ストアに、和柄ミッキーがお目見えしました。");
		System.out.println();
	}
}
