import java.util.*;
public class PrintfLesson{
	public static void main(String[] args){
		System.out.println(Math.PI);
		System.out.printf("%.2f%n",Math.PI);
		System.out.printf("Hallo");

		int num=20220328;
		System.out.printf("%,d%n",num);//%n改行

		String name="山田";
		int age = 23;
		System.out.printf("こんにちは%s(%d)さん%n",name,age);

		System.out.printf("%,6d%n",34);//5桁文のスペースを空けて,3桁ごとに,を入れて表示(右揃え)
		System.out.printf("%,6d%n",2534);
		System.out.printf("%,6d%n",3);
		System.out.printf("%,6d%n",10059);
	}
}
