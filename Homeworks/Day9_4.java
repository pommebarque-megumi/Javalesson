import java.util.*;
public class Day9_4{
	public static void main(String[] args){
	/*【円錐の体積】*/
		System.out.println("【円錐の体積を求めます】");
		System.out.print("底の円の直径cm>>");
		double diameter = new Scanner(System.in).nextDouble();
		System.out.print("円錐の高さcm>>");
		double height = new Scanner(System.in).nextDouble();
		double conevolume = cone(diameter,height);
		System.out.printf("直径%.1fcm,高さ%.1fcmの円錐の体積は%.1f㎤です%n",diameter,height,conevolume);

	/*【人口密度】*/
		System.out.println("【1㎡あたりの人口密度を計算し、密になっていないか調べます。】");
		System.out.print("人数を入力してください>>");
		int numOfPeople = new Scanner(System.in).nextInt();
		System.out.print("面積を入力してください㎡>>");
		int area = new Scanner(System.in).nextInt();
		double populationDensity = populationDensity(numOfPeople,area);
		if(populationDensity>2){
			System.out.printf("1㎡あたりの人数は%.1fなので",populationDensity);
			System.out.println("密です!!");
		}else{
			System.out.printf("1㎡あたりの人数は%.1fなので",populationDensity);
			System.out.println("安全です");
		}

	/*【マイルを㎞に変換】*/
		System.out.println("【マイルを㎞に変換します】");
		System.out.print("何マイルですか？>>");
		double mile = new Scanner(System.in).nextDouble();
		double km = forKm(mile);
		System.out.printf("%.3fマイルは、%.3f㎞です。%n",mile,km);

	}
//ここからメソッド//
	/*【円錐の体積】*/
	public static double cone(double diametercm , double heightcm){
		double circlearea = (diametercm/2)*(diametercm/2)*3.14;
		double conevolume = circlearea * heightcm * (0.33);
		return conevolume;
	}
	/*【人口密度】*/
	public static double populationDensity(int numOfPeople , double areakm){
		double populationDensity = numOfPeople / areakm;
		return populationDensity;
	}
	/*【マイルを距離に変換】*/
	public static double forKm(double mile){
		double km = mile*1.609;
		return km;
	}
}
