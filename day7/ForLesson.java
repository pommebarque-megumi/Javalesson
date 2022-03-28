import java.util.*;
public class ForLesson{
	public static void main(String[] args){
		System.out.println("START");
		int sum = 0;
		for(int i=10 ; i<1000 ; i++){//for文の()内の変数はfor{}ブロック内でのみ有効
			System.out.println(i);
			sum +=i;//sum=sum+i;
		}
		System.out.println(sum);
		System.out.println("END");
		//System.out.println(i);--”5”と表示されるcause;i=5でループから抜けるから
		for(int a=10 ; a>0 ; a--){
			System.out.println(a);
		}

		for(int b=0 ; b<=10 ; b+=2){
			System.out.println(b);
		}
	}
}
