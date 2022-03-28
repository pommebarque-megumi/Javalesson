import java.util.*;
public class Fortune{
	public static void main(String[] ards){
		int fortune = new Random().nextInt(10) +1;
		switch(fortune){//変数に入ったものによって分岐する指令文
			case 1://= (if(fortune=1))　変数に入ったものが1だからcase1を実行する
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.println("大吉");
				break;//処理を終わらせる文。ないと次のcaseまで実行されてしまう。
			case 2:
			case 9:
			case 10:
				System.out.println("中吉");
				break;
			case 3:
				System.out.println("吉");
				break;
			default:
				System.out.println("凶");
		}
	}
}
