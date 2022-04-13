public class MethodLesson2{
	static void preCook(){
		System.out.println("材料を揃える");
		System.out.println("野菜を切る");
		System.out.println("肉を切る");
	}
	static void mainCook(){
		System.out.println("食材を炒める");
		System.out.println("水を入れて鍋で煮込む");
		System.out.println("ルーを加えて更に煮込む");
	}
	public static void main(String[] args){
		System.out.println("☆カレーを作るよ☆");
		preCook();
		mainCook();
		System.out.println("☆カレーができたよ☆");
	}//Method分割
}

