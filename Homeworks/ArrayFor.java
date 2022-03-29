import java.util.*;
public class ArrayFor{
	public static void main(String[] args){
		System.out.print("How many steps?>>");
		int step = new Scanner(System.in).nextInt();
		String[] symbols = {"o *"," ＋+"," 〇 "," ・ "," ° "," 。"," - "};
		for(int i=0 ; i<step ; i++){
			for(int j=0; j<step ; j++){
				int rnd= new Random().nextInt(7);
				System.out.print(symbols[rnd]);
			}
			System.out.println();
		}
	}
}
