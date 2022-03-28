import java.util.*;
public class For2{
	public static void main(String[] args){
		System.out.print("いくつ？>>");
		int a = new Scanner(System.in).nextInt();
		for(int i=0 ; i<a ; i++){
			//System.out.print("*");
			for(int j=0 ; j<a ; j++){
				System.out.print("*");
			}
			System.out.println();
		}//表を作りたい時にも便利！2重For文
	}
}
