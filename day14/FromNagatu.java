import java.util.*;
public class FromNagatu{
	public static void main(String[] args){
		Random rnd = new Random();
		String[] items = {"A","B","C","D","E"};
		System.out.print("何行にしますか？>>");
		int heigt = new Scanner(System.in).nextInt();
		String[][] alphabets = new String[heigt][];

		for(int i=0 ; i<heigt ; i++){
			System.out.printf("%d行目はいくつにしますか？>>",i+1);
			int width = new Scanner(System.in).nextInt();
			alphabets[i] = new String[width];
			for(int j=0 ; j<width ; j++){
				int n= rnd.nextInt(5);
				alphabets[i][j] = items[n];
			}
		}
		for(int i=0 ; i<alphabets.length ; i++){
			System.out.printf("%d:",i+1);
			for(int j=0 ; j<alphabets[i].length ; j++){
				System.out.print(alphabets[i][j]);
			}
			System.out.println();
		}
	}
}
