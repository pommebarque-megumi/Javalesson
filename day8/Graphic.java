public class Graphic{
	public static void main(String[] args){
		for(int i=1 ; i<=6 ; i++){
			for(int j=1 ; j<=12 ; j++){
				System.out.print((i+j)%3==0?"=":"|");
			}
			System.out.println();
		}
	}
}
