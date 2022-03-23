import java.util.*;
public class Marry{
	public static void main(String[] args){
		/*
		 *女性16、男性18以上
		DRYの原則　(Don't Repeat Yourself)同じことを2度も書かない
		*/
		System.out.print("性別(男性・女性)");
		String gender = new Scanner(System.in).nextLine();
		System.out.print("年齢>>");
		int age = new Scanner(System.in).nextInt();
		/*boolean ok;
		if(gender.equals("男")){
			if(age >= 18){
				ok = true;
			}else{
				ok = false;
			}
		}else{
			if(age >= 16){
				ok = true;
			}else{
				ok = false;
			}
		}
		if(ok){
			System.out.println("年齢が" + age + "歳で、" + gender + "のあなたは結婚できます！");
		}else{
			System.out.println("年齢が" + age + "歳で、" + gender + "のあなたはまだ結婚できません。");
		} 佐々木さんに教わった↑*/

		if((gender.contains("女") && age >=16) || (gender.contains("男") && age >=18)){
			//内側の()はなくてもOK。マナーとしてつけとくと◎　※contains=含まれる
			System.out.print(age + "歳で" + gender + "のあなたはもう結婚できます！");//equals=等しい
		}else{
			System.out.print(age + "歳で" + gender + "のあなたはまだ結婚できません。");
		}//&&=かつ・||=もしくは
	}
}
