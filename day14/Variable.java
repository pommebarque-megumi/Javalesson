import java.util.*;
public class Variable{
	public static void main(String[] args){
		int n;
		System.out.println(n);

		int n;
		int x=5;
		if(x>0)A{//if(5>0)ならOK！
			n=10;
		}
		System.out.println(n);
		//上記はJavaコンパイラが条件式内の変数に対して調査を行わないため、ダメかなと判断してNG。

		int n;
		int x=5;
		if(x>0){
			n=10;
		}else{//ここがelse if(x<=0)だとNG.次にeleseの処理でnに代入する処理が書かれていればOK。
			n=20;//もしどの分岐にも代入処理がない場合はNG。
		}
		System.out.println(n);
		//こちらはif else文なので必ずどちらかの処理が行われる。今回両方の処理でnに代入されているので、OK。

		int n =new Random().nextInt()3;
		String fortune;
		switch(n){//ここが変数だからNG
			case 0:
				fortune="Mervelous";
			break;
			case 1:
			fortune="Good";
			break;
			case 2://上が変数でもdefaultがあるならOK
			fortune="Bad";
		}
		System.out.println("fortune");

		int n;
		boolean isOK=true;
		if(isOK){//if(true)ならOK
			n=10;
		}

		int n;//これはOK.do Whileは必ず1回実行するから
		do{
			n=10;
		}while(false);

		int n;
		for(int i=0 ; i=10 ; i++){//継続する条件が変数で表現されているため、チェックしてもらえない。
			n=3;
			break;
		}

	}
}
