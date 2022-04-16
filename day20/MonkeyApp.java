import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Monkey monkey1 = new Monkey();
		Scanner scan = new Scanner(System.in);

		System.out.print("おさるの名前を決めてください>>");
		monkey1.name = scan.nextLine();
		System.out.print("おさるの年齢を決めてください>>");
		monkey1.age = scan.nextInt();

		//boolean isContinue = true;
		while(true/*isContinue*/){
			System.out.print("おさるに何をさせますか？1：挨拶・2：竹馬・3：逆立ち・4：終了");
			int n = scan.nextInt();
			switch(n){
				case 1:
					monkey1.greeting();
					break;
				case 2:
					monkey1.takeuma();
					break;
				case 3:
					monkey1.sakadachi();
					break;
				case 4:
					//isContinue = false;
					System.out.println("アプリケーションを終了します");
					return;//長須さんから
			}
		}
	}
}
