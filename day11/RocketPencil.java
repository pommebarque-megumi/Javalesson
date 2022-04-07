import java.util.*;
public class RocketPencil{
	public static void main(String[] args){
		final String[] pencils = {"A","B","C","D","E"};
		int count =1;
		boolean isContinue=true;
		do{
			String temp = pencils[0];
			for(int i= 0 ; i<pencils.length-1 ;i++){
				pencils[i] = pencils[i+1];
				System.out.println(Arrays.toString(pencils));
			}
			pencils[pencils.length-1] = temp;
			System.out.println(Arrays.toString(pencils));
			System.out.println("続けますか？Q：終了");
			String in = new Scanner(System.in).next();
			if(in.equals("q") || in.equals("Q")){
				isContinue = false;
				break;
			}

		}while(isContinue == true);
	}
}
