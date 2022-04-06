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
/*じゃんけんの結果をランダムで表示させるプログラムです。
 * 以下のように表示したいので、A～Dに適切に追加して完成させてください。
 *(〇と×はランダムです)
 *
 * ++結果++
 *1回目　〇,×,〇
 *2回目　×,〇,〇
 *3回目　〇,〇,×
 *
 */


		//A
		for(int i=0 ; i<jyanken.length ; i++){
			//B
			for(int j=0 ; j<jyanken[i].length ; j++){
				//C
			}
			//D
		}
	}
}
