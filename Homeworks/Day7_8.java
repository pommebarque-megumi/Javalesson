import java.util.*;
public class Day7_4{
	public static void main(String[] args){
		Random rnd = new Random();
		final int N =6;
		String[][] cardsSample =new String[N][N];//見本出力用
		int[][] cards = new int[N][N];//実際のカード用

		//int型配列を2つ用意し、それぞれシャッフル
		int[] numsA = new int[N*N/2];
		int[] numsB = new int[N*N/2];

　　//まず配列に数値を入れる
		for(int i=0 ; i.numsA.length ; i++){
			numsA[i] = i+1;
			numsB[i] = i+1;
		}
    //数値をシャッフル(偶数階と奇数回)
		for(int i=0 ; i<numsA.length*2 ; i++){
			if(i%2==0){
				int idx = rnd.nextInt(numsA.length+i)-i;
				int temp = numsA[idx];
				numsA[idx] = numsA[i];
				numsA[i] = temp;
			}else{
				int idx = rnd.nextInt(numsB.length+i)-i;
				int temp = numsB[idx];
				numsA[idx] = numsA[i];
				numsA[i] = temp;
			}
		}
		//cardsに上記から数字を入れていく(サンプルにも)
		for(int i=0 ; i<cards.length ; i++){
			for(int j=0 ; j<cards[i].length ; j++){
				if(i%2==0){
					cards[i][j] = numsA[i];
				}else{
					cards[i][j] = numsB[i];
				}
			}
		}
		for(int i=0 ; i<cardsSample.length ; i++){
			for(int j=0 ; j<cardsSample.length ; j++){
				cards[i][j]=("□");
			}
		}

		//ゲーム開始何ペアあてられるか
		//5回ミスをしたら終了
		//その時に何枚ペアを取れたか表示する
		int miss = 0;
		while(miss=5){
			System.out.println("カードを選択してください。");
		for(int i=0 ; i<cardsSample.length ; i++){
			for(int j=0 ; j<cardsSample.length ; j++){
				System.out.print(cardsSamle[i][j]);
			}
			System.out.println();
		}
			System.out.printf("1枚目:上から何番目？>>");
			int h = new Scanner(System.in).nextint();
			System.out.print("%s枚目左から何番目？>>");
			int w = new Scanner(System.in).nextint();

			System.out
		}
	}
}
