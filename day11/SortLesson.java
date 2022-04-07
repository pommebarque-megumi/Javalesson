import java.util.*;
public class SortLesson{
	public static void main(String[] args){
		System.out.print("人数を入力>>");
		int man = new Scanner(System.in).nextInt();
		int[] scores = new int[man];

		for(int i=0 ; i<scores.length ; i++){
			scores[i] = new Random().nextInt(101);
		}

		System.out.println(Arrays.toString(scores));

		for(int i=0 ; i<scores.length-1 ; i++){
			for(int j=i+1 ; j<scores.length ; j++){
				if(scores[i]<scores[j]){
					int temp = scores[j];
					scores[j] = scores[i];
					scores[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(scores));
	}
}
