import java.util.*;
public class Fee{
	public static void main(String[] args){
		/*男性：2000（65歳以上：1500）
		 *女性：1800（65歳以上：1200）
		 5歳以下：無料
		 */
		System.out.print("性別を入力してください（男・女）>>");
		String gender = new Scanner(System.in).next();//一文字だからnext() Lineがない
		System.out.print("年齢を入力してください>>");
		int age = new Scanner(System.in).nextInt();
    int fee;//変数の値を決めていない(初期化されていない)
    if(gender.equals("男")){//Strin型は必ずequalsを使う
		  if (age >= 65){//if else文は必ずどちらかを通す構文
				fee= 1500;//ここでfeeの値を初期化している
			}else if(age < 5){//else ifと書いてしまうと、どちらも通らないケースを予想してエラーになる
			fee = 0;
			}else{
			fee = 2000;
      }
		}else{
			if(age >= 65){
			  fee = 1200;
			}else if(age < 5){
				fee = 0;
			}else{
				fee = 1800;
		  }
		}
		System.out.println("料金は"+ fee +"円です");
	}
}
