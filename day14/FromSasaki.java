import java.util.*;
public class FromSasaki{
	public static void main(String[] args){
		final String[] ITEMS = {"〇","×","□"};
		final int N = 3;
		String[] user = {"先攻","後攻"};
		String[][] boad = new String[N][N];/*{
																				{"□","□","□"},
																				{"□","□","□"},
																				{"□","□","□"},
																				};*/
		System.out.println("空いている箇所(□)に、先攻〇・後攻×を入力し盤面を埋めてください。");
			for(int i=0 ; i<boad.length ; i++){
				for(int j=0 ; j<boad[i].length ; j++){
					boad[i][j] = ITEMS[2];
					System.out.print(boad[i][j]);
				}
				System.out.println();
			}

		int count=0;
		while(count <= N*N-1){
			if(count%2==0){
				System.out.printf("%sの方%sを入力してください%n",user[0],ITEMS[0]);
				System.out.print("上から何番目？>>");
				int h = new Scanner(System.in).nextInt();
				System.out.print("左から何番目？>>");
				int w = new Scanner(System.in).nextInt();
				if(boad[h-1][w-1].equals("□")){
					boad[h-1][w-1] = ITEMS[0];
					count++;
				}else{
					System.out.print("空いている所を指定してください");
				}
			}else{
				System.out.printf("%sの方%sを入力してください%n",user[1],ITEMS[1]);
				System.out.print("上から何番目？>>");
				int h = new Scanner(System.in).nextInt();
				System.out.print("左から何番目？>>");
				int w = new Scanner(System.in).nextInt();
				if(boad[h-1][w-1].equals("□")){
					boad[h-1][w-1] = ITEMS[1];
					count++;
				}else{
					System.out.print("空いている所を指定してください");
				}
			}
			for(int i=0 ; i<boad.length ; i++){
				for(int j=0 ; j<boad[i].length ; j++){
					System.out.print(boad[i][j]);
				}
				System.out.println();
			}
		}
		System.out.println("全て埋まりました！");
	}
}
