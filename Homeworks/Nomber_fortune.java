import java.util.*;
public class Nomber_fortune{
	public static void main(String[] args){
		System.out.println("- - - - - - - - Lucky nomber - - - - - - - - -");
		int nomber1 = new Random().nextInt(10)+1;
		int nomber2 = new Random().nextInt(101)+100;
		int nomber3 = new Random().nextInt(11)-5;
	  char a = '点';
		int total = (nomber2 - nomber1) * nomber3;
		System.out.println("Your nomber is" + total + a);
		if (total >= 1){
			System.out.println("You're Lucky Today! I'm happy too.");
		 }else if (total <= 0){
		  System.out.println("You're Unlucky Today... Don't worry, just try again tomorrow.");
		 }
	}
}
