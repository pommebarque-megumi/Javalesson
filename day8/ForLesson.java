import java.util.*;
public class ForLesson{
	public static void main(String[] args){
/*		for(int i=0 ; i<10 ; i++){
			if(i%3==0){
				continue;
			}
			if(i%5==0){
				break;
			}
			System.out.println(i);
		}*/
		for(int i=10 ; i<30 ; i+=10){//下の処理をするよ　jから戻ってきたら　i+10して30まで同じことの繰り返し
			for(int j=1 ; j<5 ; j++){//jが2になるまでiにjを足すよ　終わったら上のFor文に戻る
				System.out.println(i+j);
				if(j==3){
				}break;//このif文を入れてしまうと、j=3になった時点で2つ目のFor文を終わりにしてしまう。つまり、4と5は足されない
			}//return;を入れると全て終わりにできる。1つ目のForの外に目印を置いて、break〇〇;とすると外のループも出る。
		}
	}
}
