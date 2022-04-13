import java.util.*;
public class Method1{
	public static void main(String[] args){
		int max = maxof(3,8);
		System.out.println(max);
		double area = calcTriangleArea(3.0,2.5);
		System.out.println(area);

		boolean isSame = isSame(new int[]{3,3,3});
		if(isSame){//()内がtrueの時に中の処理
			System.out.println("要素は全て等しい");
		}else{
			System.out.println("要素は全て等しいわけではありません");
		}

		int price = 250;
		int tax = 8;
		int taxIn = calcTaxIn(price , tax);
		System.out.printf("定価%dの税込み(税率%d%%)価格は%dです。%n",price,tax,taxIn);

		System.out.print("身長を入力>>");
		double height = new Scanner(System.in).nextDouble();
		System.out.print("体重を入力>>");
		double weight = new Scanner(System.in).nextDouble();
		double bmi = calcBMI(weight,height);
		System.out.printf("BMI:%.2f%n",bmi);

	}


	public static int maxof(int a,int b){
		return (a>b ? a : b);
	}

	public static double calcTriangleArea(double bottom,double height){
		double area = bottom*height/2;
		return area;
	}

	public static boolean isSame(int[] arr){
		int first = arr[0];
		for(int i=0 ; i<arr.length ; i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}

	public static int calcTaxIn(int price,int tax){
		int taxIn = (int)(price*(1+tax/100d));
		return taxIn;
	}

	public static double calcBMI(double weightkg,double heightcm){
		double bmi = weightkg / (heightcm/100*heightcm/100);
		return bmi ;
	}
}
