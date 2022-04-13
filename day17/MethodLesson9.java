import java.util.*;
public class MethodLesson9{
	static double calcbmi(double weightkg , double heightcm){
		heightcm /= 100;//double heightm = hegihtcm/100;
		return weightkg/(heightcm*heightcm);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("体重を入力してください>>");
		double weightkg = scan.nextDouble();
		System.out.print("身長を入力してください>>");
		double heightcm = scan.nextDouble();
		double bmi = calcbmi(weightkg,heightcm);
		System.out.printf("身長%.1fcm・体重%.1fkgだと、BMIは%.1fです。%n",heightcm,weightkg,bmi);

	}
}
