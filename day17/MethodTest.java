import java.util.*;
public class MethodTest{

	static void objectMaker(char object,int widthHeight){
		for(int i=0 ; i<widthHeight ; i++){
			for(int j=0 ; j<widthHeight ; j++){
				System.out.print(object);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("好きな記号を入力してください>>");
		String object = scan.next();
		char charobject = object.charAt(0);
		System.out.print("何行何列出力しますか？>>");
		int widthHeight = new Scanner(System.in).nextInt();

		objectMaker(charobject,widthHeight);
		scan.close();
	}
}
