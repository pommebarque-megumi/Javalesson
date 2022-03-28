import java.util.*;
public class Jyanken{
	public static void main(String[] args){
		/*
		 *手を入力（グー:0 チョキ:1 パー:2）>>
		 あなたはチョキ、私はパー
		 あなたの勝ちです。
		 */
		int pc = new Random().nextInt(3);
		System.out.println("手を入力してください。グー:0 /チョキ:1 /パー:2");
		int you = new Scanner(System.in).nextInt();
		if(pc==0){
			if(you==0){
				System.out.println("あなたは"+you+"私は"+pc+"、あいこです。");
			}else if(you==1){
				System.out.println("あなたは"+you+"私は"+pc+"、あなたの負けです。");
			}else{
				System.out.println("あなたは"+you+"私は"+pc+"、あなたの勝ちです。");
			}
		}else if(pc==1){
			if(you==0){
				System.out.println("あなたは"+you+"私は"+pc+"、あなたの勝ちです。");
			}else if(you==1){
				System.out.println("あなたは"+you+"私は"+pc+"、あいこです。");
			}else{
				System.out.println("あなたは"+you+"私は"+pc+"、あなたの負けです。");
			}
		}else{ 
			if(you==0){
				System.out.println("あなたは"+you+"私は"+pc+"、あなたの負けです。");
			}else if(you==1){
				System.out.println("あなたは"+you+"私は"+pc+"、あなたの負けです。");
			}else{
				System.out.println("あなたは"+you+"私は"+pc+"、あいこです。");
			}
		}
	}
}
