import java.util.*;
public class DinoApp{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("森で大きなたまごを見つけたよ！");
		System.out.println("どうしますか？0：持ち上げる,1：じっと見守る");
		int n = scan.nextInt();
		Thread.sleep(2000+n*1000);
		Dinosaur dinosaur1 = new Dinosaur();
		int friendPoint= dinosaur1.friendPoint();
		dinosaur1.bornDino();
		String name = dinosaur1.nameToDino();
		boolean isContinue = true;
		while(isContinue){
			isContinue = dinosaur1.dinoCare();
		}

	}
}
