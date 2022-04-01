import java.util.*;
public class StringMethod{
	public static void main(String[] args){
		String fruits = "apple";
		//文字数
		System.out.println(fruits.length());//5

		for(int i=0 ; i<fruits.length() ; i++){//fruitsの中の文字を全て表示
			System.out.println(fruits.charAt(i));
		}
		char[] data=fruits.toCharArray();//fruitsの中の文字をchar型配列に格納する
		System.out.println(Arrays.toString(data));

		if(fruits.contains("pp")){
			System.out.println("PPを含みます");
		}
		if(fruits.equals("apple")){
			System.out.println("appleと等しい");
		}
		if(fruits.equalsIgnoreCase("apple")){//大文字小文字は区別しない
			System.out.println("appleと等しい");
		}

		//大文字にしたものを作ってくれる
		String str=fruits.toUpperCase();
		System.out.println(fruits.toUpperCase());

		//小文字にしたものを作ってくれる
		String str1 = fruits.toLowerCase();
		System.out.println(fruits.toLowerCase());


		if(fruits.startsWith("a")){
			System.out.println("aで始まります");
		}
		if(fruits.endsWith("s")){
			System.out.println("sで終わります");
		}


		String str2 = fruits.substring(0,3);//以上と未満を入力すると、その部分の文字だけ表示
		System.out.println(str2);//app

		String str3 = fruits.substring(2,4);//以上と未満を入力すると、その部分の文字だけ表示
		System.out.println(str3);//pl
		String str4 = fruits.substring(0,fruits.length()-1);//最後の1文字削除-2なら2文字削除
		System.out.println(str4);//appl

		//アルファベットaから10個(a,b,c...)
		char[] chars=new char[10];
		char alph = 'a';
		for(int i=0; i<chars.length ;i++){
			chars[i]=alph;
			alph +=1;
		}
		System.out.print(chars);

		char[] japanese =new char[10];
		char hiragana = 'あ';
		for(int i=0; i<chars.length ;i++){
			japanese[i]=hiragana;
			hiragana +=1;
		}
		System.out.print(chars);
	}
}
