import java.util.*;
//長須さんのアイディア
public class Saikoro{
	public static void main(String[] args){
		System.out.println("サイコロを3回振って、同じ目を出してみましょう！");
		int one = new Random().nextInt(6)+1;
		System.out.print("("+one+")");
		int two = new Random().nextInt(6)+1;
		System.out.print("("+two+")");
		int three = new Random().nextInt(6)+1;
		System.out.println("("+three+")");
		if(one == two && two == three){
			System.out.println("Marverous!");
		}else if(one == two||two == three||one == three){
			System.out.println("Lucky!");
		}else{
			System.out.println("Let's try again!");
		}
	}
}
