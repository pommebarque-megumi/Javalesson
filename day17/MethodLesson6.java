import java.util.*;
public class MethodLesson6{
	static void decolate (String title){
		for(int i=0 ; i<title.length()+2 ; i++){
			System.out.print("*");
		}
		System.out.println();
	}
	static void titleDecolate(String title){
		decolate(title);
		System.out.println("*"+title+"*");
		decolate(title);
	}

	public static void main(String[] args){
		System.out.print("半角英字でタイトルを入力>>");
		String title = new Scanner(System.in).nextLine();
		titleDecolate(title);
	}
}
