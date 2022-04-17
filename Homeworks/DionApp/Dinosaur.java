import java.util.*;
public class Dinosaur{
	String[] dino = {"ティラノサウルス","トリケラトプス","プテラノドン",};
	String friendDino;
	String name;
	int friendPoint;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);

	public int friendPoint(){
		friendPoint = rand.nextInt(10)+1;
		return friendPoint;
	}
	public void bornDino(){
		int idx = rand.nextInt(3);
		friendDino = this.dino[idx];
		System.out.printf("%sが生まれたよ！なつき度は%dだよ%n",this.friendDino,this.friendPoint);
	}

	public String nameToDino(){
		System.out.printf("生まれた%sに名前をつけてね>>",this.friendDino);
		this.name = new Scanner(System.in).nextLine();
		return this.name;
	}
	public void meal(){
		System.out.println(this.name+"はおいしそうに食べている");
		if(friendDino==dino[0]){
			this.friendPoint += 8;
		}else if(friendDino==dino[1]){
			this.friendPoint += 5;
		}else{
			this.friendPoint += 8;
		}
	}

	public void brush(){
		if(this.friendPoint<20){
			if(this.friendDino==this.dino[0]){
				System.out.println("ちょっと噛まれた・・・");
				this.friendPoint += 5;
			}else if(this.friendDino==this.dino[1]){
				System.out.println("ちょっと蹴られた・・・");
				this.friendPoint += 8;
			}else{
				System.out.println("ちょっとつつかれた・・・");
				this.friendPoint += 5;
			}
		}else if(this.friendPoint<35){
			System.out.println(this.name+"はおとなしくしている");
			this.friendPoint += 10;
		}else{
			System.out.println(this.name+"は嬉しそうにしている");
			this.friendPoint += 15;
		}
	}
	public void walking(){
		System.out.println(this.name+"とのんびりお散歩した");
		this.friendPoint+=20;
	}
	public void showFriendPoint(){
		System.out.println("なつき度は"+this.friendPoint);
		if(this.friendPoint==99){
			System.out.println("なつき度は最大です");
		}else if(this.friendPoint>70){
			System.out.printf("あなたと%sは相棒です%n",this.name);
		}else if(this.friendPoint>55){
			System.out.println("超仲良し");
		}else if(this.friendPoint>40){
			System.out.println("ともだち！");
		}else if(this.friendPoint>=20){
			System.out.println("ちょっと仲良くなったみたい");
		}else{
			System.out.println("まだ打ち解けてないみたい・・・");
		}
	}
	public boolean dinoCare()throws Exception{ 
		boolean isContinue=true;
		if(friendPoint>=40){
			System.out.print(name+"と何をしてすごしますか？>>1:ご飯をあげる,2:ブラッシング,3:一緒にお散歩する,9:アプリを終了する");
			int select = scan.nextInt();
			Thread.sleep(1000);
			switch(select){
				case 1:
					meal();
					showFriendPoint();
					System.out.println();
					isContinue=true;
					break;
				case 2:
					brush();
					showFriendPoint();
					System.out.println();
					isContinue=true;
					break;
				case 3:
					walking();
					showFriendPoint();
					System.out.println();
					isContinue=true;
					break;
				case 9:
					isContinue=false;
			}
			return isContinue;
		}else{
			System.out.print(name+"と何をしてすごしますか？>>1:ご飯をあげる,2:ブラッシング,9:アプリを終了する");
			int select = scan.nextInt();
			Thread.sleep(1000);
			switch(select){
				case 1:
					meal();
					showFriendPoint();
					System.out.println();
					isContinue=true;
					break;
				case 2:
					brush();
					showFriendPoint();
					System.out.println();
					isContinue=true;
					break;
				case 9:
					isContinue=false;
			}
			return isContinue;
		}
	}
}
