import java.util.*;
public class ForTest{
	public static void main(String[] args){
		String[] winLose = {"〇","×"};
		String[][] jyanken = new String[3][3];
		Random rnd = new Random();
		int n =rnd.nextInt(winLose.length);

		for(int i=0 ; i<jyanken.length ; i++){
			for(int j=0 ; j<jyanken[i].length ; j++){
				jyanken[i][j] = winLose[n];
			}
		}

		System.out.println("++結果++");
		for(int i=0 ; i<jyanken.length ; i++){
			System.out.printf("%d回目 ",i+1);
			for(int j=0 ; j<jyanken[i].length ; j++){
			System.out.printf("%s",jyanken[i][j]);
			}
			System.out.println();
		}
	}
}
