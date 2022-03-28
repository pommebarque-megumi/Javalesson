import java.util.*;
public class WhileLesson2{
	public static void main(String[] args){
		int count =0;
		while(true){
			count++;
			int rnd = new Random().nextInt(100);
			if(rnd < 1){
				System.out.println("SSR!!");
				break;
			}else if(rnd < 4){
				System.out.println("SR!");
			}else if(rnd < 27){
				System.out.println("R");
			}else{
				System.out.println("Normal");
			}
		}
			System.out.println(count +"回目でSSRが出ました。");
	}
}
