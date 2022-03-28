import java.util.*;
public class For1{
	public static void main(String[] args){
		System.out.println("いくつ？>>");
		int a =new Scanner(System.in).nextInt();

		for(int i=0 ; i<a ; i++){
			System.out.print("*");
		}
		System.out.println();
	}
}
