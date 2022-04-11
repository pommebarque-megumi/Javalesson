import java.util.*;
public class Day10_4{
	public static void main(String[] args){
		/*【多角形の内角の和】*/
		System.out.print("何角形にしますか？>>");
		int angle = new Scanner(System.in).nextInt();
		int sumOfInternalAngle = sumOfIA(angle);
		System.out.printf("%d角形の内角の和は%d°です。%n",angle,sumOfInternalAngle);
	}
	/*METHOD*/
	public static int sumOfIA (int angle){
		int sumOfIA = 180*(angle-2);
		return sumOfIA;
	}
}
