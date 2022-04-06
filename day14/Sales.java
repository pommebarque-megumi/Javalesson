import java.util.*;
public class Sales{
	public static void main(String[] args){
		Random rnd =new Random();
		int[][] sales = new int [12][31];
		for(int i=0 ; i<sales.length ; i++){
			int sum =0;
			System.out.printf("%2d月｜",i+1);
			for(int j=0 ; j<sales[i].length ;j++){
				if(i+1 == 2){
					if(j<27){
						sales[i][j]=rnd.nextInt(40)+10;
						System.out.printf("%2d ",sales[i][j]);
					}else{
						sales[i][j]=0;
						System.out.printf("%2d ",sales[i][j]);
					}
				}else if((i+1==4)||(i+1==6)||(i+1==9)||(i+1==11)){
					if(j<30){
						sales[i][j]=rnd.nextInt(40)+10;
						System.out.printf("%2d ",sales[i][j]);
					}else{
						sales[i][j]=0;
						System.out.printf("%2d ",sales[i][j]);
					}
				}else{
					sales[i][j]=rnd.nextInt(40)+10;
						System.out.printf("%2d ",sales[i][j]);
				}
				sum += sales[i][j];
			}
			System.out.printf("｜%4d%n",sum);
		}
	}
}
